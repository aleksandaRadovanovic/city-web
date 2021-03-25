<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City-add</title>
</head>
<body>
	<p>Unseite podatke za novi grad...</p>
	<p>${message}</p>

	<form action="${pageContext.request.contextPath}/city" method="post">
		<table>
			<tr>
				<td>Naziv grada:</td>
				<td><input type="text" id="naziv" name="naziv" value=""></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>Postansiki broj:</td>
				<td><input type="text" id="postBroj"name="postBroj" value=""></td>
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