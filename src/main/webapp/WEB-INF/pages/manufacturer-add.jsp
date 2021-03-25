<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacturer-add</title>
</head>
<body>
	<p>Unseite podatke za novog proizvodjaca...</p>
	<p>${message}</p>

	<form action="/servlet-introduction/manufacturer" method="post">
		<table>
			<tr>
				<td>Naziv proizvodjaca:</td>
				<td><input type="text" id="naziv" name="naziv" value=""></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>PIB:</td>
				<td><input type="text" id="pib"name="pib" value=""></td>
			</tr>
			<tr>
				<td colspan="2">${error}</td>
			</tr>
			<tr>
				<td>Maticni broj:</td>
				<td><input type="text" id="maticniBroj"name="maticniBroj" value=""></td>
			</tr>
			<tr>
				<td>Adresa:</td>
				<td><input type="text" id="adresa" name="adresa" value=""></td>
			</tr>
			<tr>
				<td>Grad:</td>
				<td><input type="text" id="grad"name="grad" value=""></td>
			</tr>
			<tr>
				<td><input type="submit" name="operation" value="dodajProizvodjaca"></td>
			</tr>
		</table>
	</form>
</body>
</html>