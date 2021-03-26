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
				<td>brisanje</td>
				<td>prikaz</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.manufacturerList}" var="element" varStatus="loop">
			<tr>
				<td>${loop.index}</td>
				<td>${element.nazivProizvodjaca}</td>
				<td>${element.pib}</td>
				<td>${element.maticniBroj}</td>
				<td>${element.adresa}</td>
				<td>${element.gradNaziv}</td>
				<c:url value="/manufacturer" var="urlDelete">
					<c:param name="index" value="${loop.index}"></c:param>
				</c:url>
				<td>
					<a href="${urlDelete}">delete</a>
				</td>
				<c:url value="/manufacturer" var="urlDetails">
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