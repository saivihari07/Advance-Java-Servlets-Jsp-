package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");
		
		String password = request.getParameter("userPassword");
		
		//creating cookies
		Cookie c1 = new Cookie("username",name);
		Cookie c2 = new Cookie("Password",password);
		
		//adding a cookie
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		//creating submit button for servlet 2
		out.print("<form action='servlet2' method='post'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
		
	}

}
