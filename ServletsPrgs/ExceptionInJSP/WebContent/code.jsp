<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<%
int a = Integer.parseInt(request.getParameter("fnum"));
int b = Integer.parseInt(request.getParameter("snum"));

int divide = a/b;
%>
</body>
</html>