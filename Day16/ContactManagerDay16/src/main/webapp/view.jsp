<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact List</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h2>Contact List</h2>

	<c:if test="${not empty successMessage}">
		<div class="success-msg">${successMessage}</div>
	</c:if>


	<div class="table-box">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Phone</th>
					<th>Email</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${contacts}">
					<tr>
						<td>${c.id}</td>
						<td>${c.name}</td>
						<td>${c.phone}</td>
						<td>${c.email}</td>
						<td><a href="update?id=${c.id}" class="action-btn edit">Edit</a><br />
							<br /> <a href="delete?id=${c.id}" class="action-btn delete">Delete</a>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
