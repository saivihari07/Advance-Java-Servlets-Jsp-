package com.LoginAndLogoutPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("userName");
		String pwd = request.getParameter("Password");
		
		if(uname.equals("abcd") && pwd.equals("abcd")) {
			HttpSession session = request.getSession();
			session.setAttribute("name",uname);
			response.sendRedirect("/profileServlet");
		}
		else {
		response.sendRedirect("index.html");
		}
			 out.close();
			
		}
		
		
	}


