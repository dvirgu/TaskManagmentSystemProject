<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">
<title>Login Page - TaskManagementSystem</title>
</head>
<body>
	<jsp:useBean id="user" scope="session"
		class="com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType" />
	<jsp:getProperty property="email" name="user" />
	: The Result is :
	<jsp:getProperty property="userName" name="user" />
</body>
</html>