package com.ecommerce.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	String url="jdbc:mysql://localhost:3306/ecommerce";
	String uname = "root";
	String pwd = "root";

	//connecting to the database
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int insertUser(User user )  {
		try { 

			Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement("insert into users(name,email,password) values(?,?,?)");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());

			preparedStatement.executeUpdate();
			return 1;
		}
		catch(Exception e) {}
		return 0;
	}

	public static boolean check(User u) throws SQLException {
		boolean status = false;
		Connection con= getConnection();  
		PreparedStatement ps=con.prepareStatement("select * from users where email=? and password=?");    
		ps.setString(1, u.getEmail());
		ps.setString(2, u.getPassword());
		ResultSet rs=ps.executeQuery();  

		status= rs.next();

		return status;
	}
}
