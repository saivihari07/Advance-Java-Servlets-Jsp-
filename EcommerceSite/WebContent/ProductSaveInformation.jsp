<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ecommerce.product.ProductDao"%>  
<jsp:useBean id="pr" class="com.ecommerce.product.Products"></jsp:useBean>  
<jsp:setProperty property="*" name="pr"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int i = ProductDao.insertProduct(pr);
if(i>0){
	out.println("Products added successfully");
	
}
else{
	out.println("products is not added");
	response.sendRedirect("AddProducts.html");
}
%>
<a href="AddProducts.html">AddProducts</a>
</body>
</html>