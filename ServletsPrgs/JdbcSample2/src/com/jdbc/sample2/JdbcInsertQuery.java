package com.jdbc.sample2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertQuery {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/crud";
		String uname = "root";
		String pwd = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pwd); 
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("insert into students values(101,'ravi',78");
		stmt.executeUpdate("insert into students values(102,'raju',65");
		stmt.executeUpdate("insert into students values(103,'nagraj',88");
		
		con.close();
	}

}
