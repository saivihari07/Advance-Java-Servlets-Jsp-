package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/C2")

public class C2 extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{  
	     
	  
	    res.setContentType("text/html");  
	    PrintWriter pw = res.getWriter();  
	      
	    Cookie ck[]=req.getCookies();  
	    pw.println("Hello "+ck[0].getValue());
	    
	    
	  
	    pw.close();
	}

}
