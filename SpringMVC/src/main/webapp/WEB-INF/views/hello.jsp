<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
	
	<meta charset="ISO-8859-1"/>
	<title>Insert title here</title>
</head>
<body>

	<h2>Hello ${name}!</h2>
	${contextPath}
	
</body>
</html>