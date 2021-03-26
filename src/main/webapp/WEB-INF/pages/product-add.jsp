<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product-add</title>
</head>
<body>
	<p>Unseite podatke za novi proizvod...</p>
	<p>${message}</p>

	<form action="/servlet-introduction/product" method="post">
		<table>
			<tr>
				<td>Naziv proizvoda:</td>
				<td><input type="text" id="naziv" name="naziv" value=""></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>Sifra proizvoda:</td>
				<td><input type="text" id="sifraProizvoda"name="sifraProizvoda" value=""></td>
			</tr>
			<tr>
				<td colspan="2">${errorA}</td>
			</tr>
			<tr>
				<td>Jedinicna cena:</td>
				<td><input type="text" id="jedinicnaCena"name="jedinicnaCena" value=""></td>
			</tr>
			<tr>
				<td colspan="2">${errorB}</td>
			</tr>
			<tr>
				<td>Merna jedinica:</td>
				<td><input type="text" id="mernaJedinica"name="mernaJedinica" value=""></td>
			</tr>
			<tr>
				<td>Valuta:</td>
				<td><input type="text" id="valuta"name="valuta" value=""></td>
			</tr>
			<tr>
				<td>Poreska stopa:</td>
				<td><input type="text" id="poreskaStopa"name="poreskaStopa" value=""></td>
			</tr>
			<tr>
				<td colspan="2">${errorC}</td>
			</tr>
			<tr>
				<td>Proizvodjac:</td>
				<td><input type="text" id="proizvodjac"name="proizvodjac" value=""></td>
			</tr>
			<tr>
				<td><input type="submit" name="operation" value="dodaj proizvod"></td>
			</tr>
		</table>
	</form>
</body>
</html>