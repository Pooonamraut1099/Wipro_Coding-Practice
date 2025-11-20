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
	<h2>Add New Contact</h2>

	<form action="add" method="post">
		Name: <input type="text" name="name"><br>
		<br> Phone: <input type="text" name="phone"><br>
		<br> Email: <input type="email" name="email"><br>
		<br>
		<center>
			<button type="submit">Add</button>
		</center>
	</form>
</body>
</html>