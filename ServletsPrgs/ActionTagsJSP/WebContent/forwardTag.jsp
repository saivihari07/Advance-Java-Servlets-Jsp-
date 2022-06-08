<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "forward.jsp"%>
<%
out.println(request.getParameter("company"));
out.println(request.getParameter("course"));
   %>
</body>
</html>