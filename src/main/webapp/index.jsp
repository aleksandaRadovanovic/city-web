<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<p>${message}</p>
	<div>
		<form name="form" method="post" action="login">
			<label for="email">Email:</label>
			<input type="text" id="email" name="email" placeholder="Enter email"/>
			
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" placeholder="Enter password"/>
			
			<input type="submit" value="login" name="login"/>
		</form>
	</div>
	
	
</body>
</html> 
