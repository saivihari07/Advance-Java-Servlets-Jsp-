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

List<Products> list = CartDao.getCartDetails();
request.setAttribute("carts", list);
%>

<div class="carthome">
<c:forEach items="${carts}" var="ct">
<div class="childcart">
<img alt="image" src="${ct.getProduct_url()}">
${ct.getProduct_price()}
${ct.getProduct_name()}
<button><a href ="Order.jsp?id=${ct.getProducts_id()}">Order</a></button>
<button><a href ="Delete.jsp?id=${ct.getProducts_id()}">Remove</a></button>
</div>



</c:forEach>


</div>
</body>
</html>