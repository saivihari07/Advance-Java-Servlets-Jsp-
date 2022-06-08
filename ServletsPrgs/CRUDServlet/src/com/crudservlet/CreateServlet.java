package com.crudservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("Password");
		String email = request.getParameter("email");
		
		Emp e = new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		
		try {
			int status = EmpDao.create(e);
		
		if(status > 0) {
			out.println("recorded successfully");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
				out.println("Sorry!Unable to record");
			}
		}
		catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
	}
	
}
