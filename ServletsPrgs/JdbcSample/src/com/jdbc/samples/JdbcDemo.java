package com.jdbc.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/crud";
		String uname = "root";
		String pass = "root";
		String query = "select name from students";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		
		 ResultSet rs = st.executeQuery(query);
		 
		 rs.next();
		 
		 String name = rs.getString("name");
		  System.out.println(name);
		  
		  st.close();
		  con.close();
	}

}
