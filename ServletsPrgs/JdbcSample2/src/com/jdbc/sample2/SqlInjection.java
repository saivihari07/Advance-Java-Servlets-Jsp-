package com.jdbc.sample2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjection {

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
		
		Statement stmt = con.createStatement();
		
		String qry = "select bankbalance from bank where username='"+uname+"'and password='"+pwd+"'";
		System.out.println("our query is"+qry);
		
		ResultSet rs = stmt.executeQuery(qry);
		
		if(rs.next()) {
			System.out.println("Balance is :"+rs.getDouble(1));
		}
		else {
			System.out.println("Invalid credentials");
		}
		con.close();
	}

}

