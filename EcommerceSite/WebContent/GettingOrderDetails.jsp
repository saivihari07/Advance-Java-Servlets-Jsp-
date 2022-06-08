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
List<Products> list = CartDao.getOrderDetails();
request.setAttribute("orders", list);
%>
<div class="maincart">
<c:forEach items="${orders}" var="ord">
<div class="childcart">
<img alt="image" src="${ord.getProduct_url()}">
${ord.getProduct_price()}
${ord.getProduct_name()}
<!--  <button><a href ="Delete.jsp?id=${ord.getProducts_id()}">Remove</a></button>-->
<button>remove</button>
</div>



</c:forEach>


</div>
</body>
</html>