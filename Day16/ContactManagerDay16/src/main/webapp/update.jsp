<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h2>Edit Contact</h2>

	<form action="update" method="post">
		<input type="hidden" name="id" value="${contact.id}"> Name: <input
			type="text" name="name" value="${contact.name}"><br> <br>
		Phone: <input type="text" name="phone" value="${contact.phone}"><br>
		<br> Email: <input type="email" name="email"
			value="${contact.email}"><br> <br>
		<center>
			<button type="submit">Update</button>
		</center>
	</form>

</body>
</html>