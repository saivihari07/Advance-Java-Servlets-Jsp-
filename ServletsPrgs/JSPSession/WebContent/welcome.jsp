<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>  
<body>  
<%   
  
String name=request.getParameter("User");  
out.print("Welcome "+name);  
  
session.setAttribute("user",name);  
  
%>
<a href="second.jsp">second jsp page</a>   
</body>  
</html>  