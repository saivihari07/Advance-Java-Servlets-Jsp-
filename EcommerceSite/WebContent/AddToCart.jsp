<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ecommerce.cart.CartDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(request.getParameter("id"));
System.out.println(id);
if(CartDao.saveAll(id)>0){
	response.sendRedirect("cartsuccess.jsp");
}

%>
</body>
</html>