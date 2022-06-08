<%@ page import="java.util.*" %>
	<%
	Date createTime = new Date(session.getCreationTime());
	
	Date lastAccessTime = new Date(session.getLastAccessedTime());
	
	Integer visitcount = new Integer(0);
	String visitKey = new String("visitcount");
	String userIdKey = new String("userId");
	String userId = new String(userIdKey);
	
	if(session.isNew()){
		session.setAttribute(visitKey,visitcount);
		session.setAttribute(userIdKey,userId);
	}
	visitcount = (Integer)session.getAttribute("visitkey");
	visitcount++;
	userId = (String)session.getAttribute("userIdKey");
	session.setAttribute("visitKey",visitcount);
	
	%>

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
	out.println(session.getId());
	
	out.println(createTime);
	
	out.println(lastAccessTime);
	
	out.println(userId);
	
	out.println(visitcount);
	%>
	
</body>
</html>
