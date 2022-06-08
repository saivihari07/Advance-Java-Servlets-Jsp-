package com.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PreparedStmt {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/crud";
		String username = "root";
		String password = "root";
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Please enter your username");
		String uname = br.readLine();
		
		System.out.println("Please enter your password");
		String pwd = br.readLine();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username,password); 
		
		String qry = "select bankbalance from bank where username=? and password=?";
		
		PreparedStatement stmt = con.prepareStatement(qry);
		stmt.setString(1,uname);
		stmt.setString(2,pwd);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("Balance is :"+rs.getDouble(1));
		}
		else {
			System.out.println("Invalid credentials");
		}
		con.close();   //Using this we can avoid of occuring SQL Injection
	}

}

