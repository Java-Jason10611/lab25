<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<c:forEach items="${Weather}" var="weatherreport">
		<var>${location}</var>
		<var>${tempeture.get(0)}</var>
		<var>${text.get(0)}</var>
	</c:forEach>
	</div>
	<a href="/">back to home</a>
</body>
</html>