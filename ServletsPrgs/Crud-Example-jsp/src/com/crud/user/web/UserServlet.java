package com.crud.user.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.userdao.UserDAO;
import com.crud.usermodel.User;


@WebServlet("/")
public class UserServlet extends HttpServlet {
	private UserDAO userdao;
    public UserServlet() {
       userdao = new UserDAO();
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		try {
		switch(action) {
		case "/new":
			showNewForm(request,response);
			break;
		case "/insert":
			insertUser(request,response);
			break;
		case "/delete":
			deleteUser(request,response);
			break;
		case "/edit":
			editForm(request,response);
			break;	
		case "/update":
			updateUser(request,response);
			break;
		default:
			listUser(request,response);
			break;
		}
	}
		catch(Exception e) {}
		
	}
	private void listUser(HttpServletRequest request,HttpServletResponse response) throws Exception, IOException {
		List<User> listuser = userdao.selectAllUsers();
		request.setAttribute("listuser",listuser);
		RequestDispatcher dispatch = request.getRequestDispatcher("user-list.jsp");
		dispatch.forward(request,response);
		}
	private void updateUser(HttpServletRequest request,HttpServletResponse response){
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		User user = new User(id,name,email,country);
		userdao.updateUser(user);
		response.sendRedirect("list");
	}
		private void showNewForm(HttpServletRequest request,HttpServletResponse response) throws Exception, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher("userform.jsp");
		dispatch.forward(request, response);
	}
		private void insertUser(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String country = request.getParameter("country");
			 User newUser = new User(name,email,country);
			 userdao.insertUser(newUser);
			 response.sendRedirect("list");
		}
		private void editForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			User existed  = userdao.selectUser(id);
			RequestDispatcher disp = request.getRequestDispatcher("userform.jsp");
			disp.forward(request, response);
		}
		private void deleteUser(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException {
			int id = Integer.parseInt(request.getParameter("id"));
			userdao.deleteUser(id);
			response.sendRedirect("list");
		}
	
	
	

}
