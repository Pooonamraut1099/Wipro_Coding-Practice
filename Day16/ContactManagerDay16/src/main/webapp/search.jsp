<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h2>Search Contact</h2>

	<form method="post" action="search">
		Name: <input type="text" name="keyword">
		<button type="submit">Search</button>
	</form>

	<br>

	<c:if test="${not empty results}">
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
			</tr>
			<c:forEach var="c" items="${results}">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.phone}</td>
					<td>${c.email}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>