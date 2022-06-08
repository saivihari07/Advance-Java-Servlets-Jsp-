<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <H1><center>Result for <%=request.getParameter("a1")%></center></H1>

<%
int a = Integer.parseInt(request.getParameter("t1"));
int b = Integer.parseInt(request.getParameter("t2"));

int c = 0;
String str = request.getParameter("a1");
if(str.equals("add"))
	c=a+b;

if(str.equals("sub"))
	c=a-b;

if(str.equals("mul"))
	c=a*b;

if(str.equals("div"))
	c=a/b;


%>
Result is :<%= c %>
</body>
</html>