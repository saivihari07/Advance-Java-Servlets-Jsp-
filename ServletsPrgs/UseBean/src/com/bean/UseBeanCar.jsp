<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<jsp:useBean id="c" class="com.bean.Car"/>
<jsp:setProperty property="name" name="c" value="BMW"/>
<jsp:getProperty property="name" name="c"/>

</body>
</html>