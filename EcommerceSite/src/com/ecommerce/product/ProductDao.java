package com.ecommerce.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.user.User;

public class ProductDao {
	String url="jdbc:mysql://localhost:3306/ecommerce";
	String uname = "root";
	String pwd = "root";
	
	//connecting to the database...
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
	
	public static int insertProduct(Products pr )  {
		int i=0;
		try { 

			Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement("insert into products(product_name,product_desc,product_url,product_price,product_cat) values(?,?,?,?,?)");
			preparedStatement.setString(1, pr.getProduct_name());
			preparedStatement.setString(2, pr.getProduct_desc());
			preparedStatement.setString(3, pr.getProduct_url());
			preparedStatement.setInt(4, pr.getProduct_price());
			preparedStatement.setString(5, pr.getProduct_cat());
			i=preparedStatement.executeUpdate();
			
		}
		catch(Exception e) {}
		return i;
	}
	public static List<Products> getProductName(int product_id) throws SQLException{
		List<Products> list = new ArrayList<>();
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from products  where products_id=?");
		ps.setInt(1, product_id);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
			 Products pr = new Products();
			 pr.setProducts_id(rs.getInt("products_id"));  
	            pr.setProduct_name(rs.getString("product_name"));  
	            pr.setProduct_desc(rs.getString("product_desc"));  
	            pr.setProduct_url(rs.getString("product_url"));  
	            pr.setProduct_price(rs.getInt("product_price"));  
	            pr.setProduct_cat(rs.getString("product_cat"));
	            list.add(pr);
	            System.out.println(list);
		 }
		 
	
		 return list;
	}
	public static List<Products> getCategory(String cat) throws SQLException{
		List<Products> list = new ArrayList<>();
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from products where product_cat=?");
		ps.setString(1, cat);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Products pr = new Products();
			pr.setProducts_id(rs.getInt("products_id"));
			pr.setProduct_name(rs.getString("product_name"));
			pr.setProduct_desc(rs.getString("product_desc"));
			pr.setProduct_url(rs.getString("product_url"));
			pr.setProduct_price(rs.getInt("product_price"));
			pr.setProduct_cat(rs.getString("product_cat"));
			list.add(pr);
		}
		System.out.println(list);
		con.close();	
		return list;
		
	}
}
