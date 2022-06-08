package com.servlets.demo1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String parameter = request.getParameter("val1");
		int i = Integer.parseInt(parameter);
		String parameter2 = request.getParameter("val2");
		int i2 = Integer.parseInt(parameter2);
		int sum = i+i2;
		out.print("<h3>The sum of two numbers is :</h3>"+sum);
	}

}
                