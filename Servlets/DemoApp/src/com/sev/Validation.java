package com.sev;

import java.io.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		

		
			if (name.equals("Chaitanya") && pass.equals("beginnersbook")) {
				RequestDispatcher dis = request.getRequestDispatcher("WelcomeUser");
				dis.forward(request, response);
			} else {
				pwriter.print("User name or password is incorrect!");
				RequestDispatcher dis = request.getRequestDispatcher("RD.html");
				dis.include(request, response);
			}
		
	}
}