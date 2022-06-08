<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ecommerce.user.UserDao"%>  
<jsp:useBean id="user" class="com.ecommerce.user.User"></jsp:useBean>  
<jsp:setProperty property="*" name="user"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int i = UserDao.insertUser(user);
	if(i>0){
		response.sendRedirect("Login.html");
	}
	else{
		response.sendRedirect("adduser-error.jsp");
	}
%>
</body>
</html>