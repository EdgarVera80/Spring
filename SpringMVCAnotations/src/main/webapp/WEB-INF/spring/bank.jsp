<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Banco</h2>
	<form action="/SpringMVCAnotations/bank/create" method="POST">
		Name: <input type="text" name="name" /><br/>
		Description: <input type="text" name="age" /><br/>
		<input type="submit" value="Save"/>
	</form>
</body>
</html>