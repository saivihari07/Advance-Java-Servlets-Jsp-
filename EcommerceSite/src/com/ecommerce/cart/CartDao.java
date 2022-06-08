package com.ecommerce.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.product.ProductDao;
import com.ecommerce.product.Products;
import com.ecommerce.user.User;

public class CartDao {
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
	
	public static int saveAll(int id)  {
		int i = 0;
		try { 

			Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement("insert into cart values(?,?,?,?,?)");
			List<Products> list = ProductDao.getProductName(id);			
			preparedStatement.setInt(1,id);
			for(Products pr:list) {
			preparedStatement.setString(2, pr.getProduct_name());
			preparedStatement.setString(3, pr.getProduct_url());
			preparedStatement.setInt(4, pr.getProduct_price());
			preparedStatement.setString(5, pr.getProduct_cat());
			
			}
			i=preparedStatement.executeUpdate();
		}
		catch(Exception e) {}
		return i;
	}
	public static List<Products> getCartDetails() throws SQLException{
		List<Products> list = new ArrayList<>();
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from cart");
		
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
			 Products pr = new Products();  
			 pr.setProducts_id(rs.getInt(1));
	            pr.setProduct_name(rs.getString(2));    
	            
	            pr.setProduct_url(rs.getString(3));  
	            pr.setProduct_price(rs.getInt(4));  
	            pr.setProduct_cat(rs.getString(5));
	            list.add(pr);
		 }
	
		 return list;
	}
	public static int OrderDetails(int id) throws SQLException{
		int i=0;
		Connection con = getConnection();
		
		PreparedStatement preparedStatement = con.prepareStatement("insert into orders values(?,?,?,?,?)");
		List<Products> list = ProductDao.getProductName(id);
		preparedStatement.setInt(1, id);
		for(Products pr :list) {
			preparedStatement.setString(2 ,pr.getProduct_name());

		preparedStatement.setString(3, pr.getProduct_url());
		preparedStatement.setInt(4, pr.getProduct_price());
		preparedStatement.setString(5, pr.getProduct_cat());
		 CartDao.deleteCart(id);
		 
		}
		i=preparedStatement.executeUpdate();
				
		return i;
		
	}
	public static List<Products> getOrderDetails() throws SQLException{
	List<Products> list = new ArrayList<>();
	Connection con = getConnection();
	
	PreparedStatement ps = con.prepareStatement("select * from orders");
	
	 ResultSet rs=ps.executeQuery();
	 while(rs.next()) {
		 Products pr = new Products();  
		 pr.setProducts_id(rs.getInt(1));
            pr.setProduct_name(rs.getString(2));    
            
            pr.setProduct_url(rs.getString(3));  
            pr.setProduct_price(rs.getInt(4));  
            pr.setProduct_cat(rs.getString(5));
            list.add(pr);
           
	 }

	 return list;
}
	public static List<Products> deleteCart(int id) throws SQLException {
		Connection con = getConnection();
		List<Products> list = ProductDao.getProductName(id);
		PreparedStatement ps = con.prepareStatement("delete * from orders where product_id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		
		return list;
		
	
}
}

