<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ecommerce.cart.CartDao"%>
   <%@page import="com.ecommerce.product.Products"%>
    <%@page import="java.util.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int id = Integer.parseInt(request.getParameter("id"));
if(CartDao.OrderDetails(id)>0){
	response.sendRedirect("OrderSuccess.jsp");
}
%>
</body>
</html>