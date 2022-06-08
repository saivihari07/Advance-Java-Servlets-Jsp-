package com.sev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	    String name =req.getParameter("name");
		PrintWriter pw=res.getWriter();
		String password =req.getParameter("password");
		if(password.equals("Gonti")) {
			pw.println("Welcome Mr."+name);
		}
		else {
			pw.println("Please enter correct password.."+name);
		}
		
				
		
		
		
	}

}
