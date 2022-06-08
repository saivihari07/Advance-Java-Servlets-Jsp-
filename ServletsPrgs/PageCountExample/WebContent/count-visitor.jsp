<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<fieldset>
<%
  Integer count=
  (Integer)application.getAttribute("count");
  if(count==null || count==0){
	  out.println("Welcome to my site");
	  count=1;
  }
  else{
	  out.println("Welcome to my site");
	  count++;
  }
  application.setAttribute("count",count);
    %>
    <p>You visited the site for <%= count %></p>
</fieldset>
</form>
</body>
</html>