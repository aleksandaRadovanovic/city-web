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
				<td>brisanje</td>
				<td>prikaz</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.productList}" var="element" varStatus="loop">
			<tr>
				<td>${loop.index}</td>
				<td>${element.nazivProizvoda}</td>
				<td>${element.sifraProizvoda}</td>
				<td>${element.jedinicnaCena}</td>
				<td>${element.mernaJedinica}</td>
				<td>${element.valuta}</td>
				<td>${element.poreskaStopa}</td>
				<td>${element.proizvodjacNaziv}</td>
				<c:url value="/product" var="urlDelete">
					<c:param name="index" value="${loop.index}"></c:param>
				</c:url>
				<td>
					<a href="${urlDelete}">delete</a>
				</td>
				<c:url value="/product" var="urlDetails">
					<c:param name="index" value="${loop.index}"></c:param>
					<c:param name="opr" value="details"></c:param>
				</c:url>
				<td>
					<a href="${urlDetails}">details</a>
				</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
</body>
</html>