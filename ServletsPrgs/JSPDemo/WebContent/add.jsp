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
	int i=Integer.parseInt(request.getParameter("fnum"));
	int j = Integer.parseInt(request.getParameter("snum"));
	
	 out.println(i+j);
%>
</body>
</html>