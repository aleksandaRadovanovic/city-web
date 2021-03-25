<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-jsp</title>
</head>
<body>
	<h2>Hello World!</h2>
	<p>${message}</p>
	<div>
		<a><h5>CITY</h5></a>
		<a href="/servlet-introduction/navigation?link=add">Unesi grad</a>
		<a href="/servlet-introduction/navigation?link=list">Prikazi gradove</a>
	</div>
	
	<div>
		<a><h5>MANUFACTURER</h5></a>
		<a href="${pageContext.request.contextPath}/navigation?link=list">Manufacturer</a>
	</div>
	
	<div>
		<a><h5>PRODUCT</h5></a>
		<a href="${pageContext.request.contextPath}/navigation?link=list">Product</a>
	</div>
</body>
</html>