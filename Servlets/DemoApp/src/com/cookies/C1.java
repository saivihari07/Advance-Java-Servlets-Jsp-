package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/C1")
public class C1 extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("userName");
		pw.println("Welcome: "+name);
		Cookie ck=new Cookie("userName",name);  
	    res.addCookie(ck);
	  
	    //creating submit button  
	    pw.print("<form action='C2' method='post'>");  
	    pw.print("<input type='submit' value='go'>");  
	    pw.print("</form>");  
	          
	    pw.close();  
	 
		
	}

}
