<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacturer-list</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>Naziv</td>
				<td>PIB</td>
				<td>Maticni broj</td>
				<td>Adresa</td>
				<td>Grad</td>
				<td>operation</td>
				<td>action</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.cities}" var="element" varStatus="loop">
			<tr>
				<td>${loop.index}</td>
				<td>${element.naziv}</td>
				<td>${element.pib}</td>
				<td>${element.maticniBroj}</td>
				<td>${element.adresa}</td>
				<td>${element.grad}</td>
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