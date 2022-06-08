package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parameter = req.getParameter("fname");
		resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.println("<h1>i am in servlet1 and i am working fine and my name is </h1>"+parameter);
		 req.setAttribute(name, "");
		 RequestDispatcher rd = req.getRequestDispatcher("/Servlet2");
		 
		 rd.forward(req, resp);
	}

}
