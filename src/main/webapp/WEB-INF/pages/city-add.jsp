<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City-add</title>
</head>
<body>
	<p>Unseite podatke za novi grad...</p>
	<p>${message}</p>

	<form action="/servlet-introduction/city" method="post">
		<table>
			<tr>
				<td>Naziv grada:</td>
				<td><input type="text" id="naziv" name="naziv" value="${applicationScope.cityDto.naziv}"></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>Postansiki broj:</td>
				<td><input type="text" id="postBroj"name="postBroj" value="${applicationScope.cityDto.postBroj}"></td>
			</tr>
			<tr>
				<td colspan="2">${error}</td>
			</tr>
			<tr>
				<td><input type="submit" name="operation" value="dodaj"></td>
			</tr>
		</table>
	</form>
</body>
</html>