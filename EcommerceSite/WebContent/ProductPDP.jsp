<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@page import="com.ecommerce.product.ProductDao"%>
   <%@page import="com.ecommerce.product.Products"%>
   <%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(request.getParameter("id"));
List<Products> list = ProductDao.getProductName(id);
request.setAttribute("mylist",list);
%>
<div class="home">
<c:forEach items = "${mylist}" var ="ldb">
<div class="child">
<img alt="image" src="${ldb.getProduct_url()}">
<p>Name:${ldb.getProduct_name()}</p>
<p>Desc:${ldb.getProduct_desc()}</p>
<p>Price:${ldb.getProduct_price()}</p>
</div>

<a href="AddToCart.jsp?id=${ldb.getProducts_id()}">Add To Cart</a>
</c:forEach>
</div>

</body>
</html>