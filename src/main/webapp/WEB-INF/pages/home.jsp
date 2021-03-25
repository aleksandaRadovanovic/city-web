<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-jsp</title>
</head>
<body>
	<h3></h3>
	<p>${message}</p>
	<div>
		<a><h5>CITY</h5></a>
		<a href="/servlet-introduction/navigation?link=add&entity=city">Unesi grad</a>
		<a href="/servlet-introduction/navigation?link=list&entity=city">Prikazi gradove</a>
	</div>
	
	<div>
		<a><h5>MANUFACTURER</h5></a>
<%-- 		<a href="${pageContext.request.contextPath}/navigation?link=list">Manufacturer</a> --%>
		<a href="/servlet-introduction/navigation?link=add&entity=manufacturer">Unesi proizvodjaca</a>
		<a href="/servlet-introduction/navigation?link=list&entity=manufacturer">Prikazi proizvodjace</a>
	</div>
	
	<div>
		<a><h5>PRODUCT</h5></a>
<%-- 		<a href="${pageContext.request.contextPath}/navigation?link=list">Product</a> --%>
		<a href="/servlet-introduction/navigation?link=add&entity=product">Unesi proizvod</a>
		<a href="/servlet-introduction/navigation?link=list&entity=product">Prikazi proizvod</a>
	</div>
	<div id="logout">
		<p></p>
		<a href="logout">[Logout]</a>
	</div>
</body>
</html>