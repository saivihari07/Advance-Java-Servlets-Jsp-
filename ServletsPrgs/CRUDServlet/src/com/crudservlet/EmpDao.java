package com.crudservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

public class EmpDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/crudservlet";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
		
		public static int create(Emp e) throws SQLException, ClassNotFoundException {
			Connection con = EmpDao.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employee(name,password,email) values(?,?,?,?)");
			pst.setString(1,e.getName());
			pst.setString(1,e.getPassword());
			pst.setString(1,e.getEmail());
			
			int status = pst.executeUpdate();
			
			return status;
			
		}
		
		public static int update(Emp e) throws ClassNotFoundException, SQLException {
			Connection con = EmpDao.getConnection();
			PreparedStatement pst = con.prepareStatement("update crudservlet set name=?,password=?,email=? where id=?");
			pst.setString(1,e.getName());
			pst.setString(2,e.getPassword());
			pst.setString(3,e.getEmail());
			pst.setInt(4,e.getId());
			
			int status = pst.executeUpdate();
			return status;
			
		}
		
		public static int delete(int id) throws SQLException, ClassNotFoundException {
			Connection con = EmpDao.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from crudservlet where id=?");
			pst.setInt(1,id);
			
			int status = pst.executeUpdate();
			
			return status;
		}
		public static Emp getEmployeeById(int id) throws SQLException, ClassNotFoundException {
			Emp e = new Emp();
			Connection con = EmpDao.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from crudservlet where id =?");
			pst.setInt(1, id);
			 int status = pst.executeUpdate();
			return e;
		}
		public static List<Emp> getAllEmployees() throws SQLException, ClassNotFoundException{
			List<Emp> list = new ArrayList<Emp>();
			
			Connection con = EmpDao.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from crudservlet");
			while(rs.next()) {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				
				list.add(e);
				
				
			}
			return list;
		}
	
	
 }

