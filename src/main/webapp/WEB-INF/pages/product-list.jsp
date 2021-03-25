<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product-list</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>Naziv</td>
				<td>Sifra proizvoda</td>
				<td>Jedinicna cena</td>
				<td>Merna jedinica</td>
				<td>Valuta</td>
				<td>Poreska stopa</td>
				<td>Proizvodjac</td>
				<td>operation</td>
				<td>action</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.cities}" var="element" varStatus="loop">
			<tr>
				<td>${loop.index}</td>
				<td>${element.naziv}</td>
				<td>${element.sifraProizvoda}</td>
				<td>${element.jedinicnaCena}</td>
				<td>${element.mernaJedinica}</td>
				<td>${element.valuta}</td>
				<td>${element.poreskaStopa}</td>
				<td>${element.proizvodjac}</td>
				<td>${element.operation}</td>
				<c:url value="/math" var="urlDelete">
					<c:param name="index" value="${loop.index}"></c:param>
				</c:url>
				<td>
					<a:href="${urlDelete}">delete</a:href>
				</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
</body>
</html>