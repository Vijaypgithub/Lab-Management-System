<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Admin</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
h1 {
	font-size: 20px;
	border-style: double;
	border-radius: 8px;
	text-align: center;
	font-family: 'Times New Roman';
	border-color: rgb(235, 52, 11);
	border-inline-color: yellow;
}

input {
	width: 150px;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: groove;
}

table, th, td {
	border: 3px solid green;
}
</style>
</head>

<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="http://localhost:8081/lab__report_creator/Homepage"
					class="navbar-brand"> Pathology lab Management System </a>
			</div>

		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Admins</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/Signup"
					class="btn btn-success">Create New Admin</a>
			</div>
			<br>
			<table class="table table-bordered table-warning table-danger">
				<thead>
					<tr>
						<th>Admin</th>
						<th>Operation</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${ListAdmin}">

						<tr>
							<td><c:out value="${user.userName}" /></td>
							<td> &nbsp;&nbsp;&nbsp;&nbsp; <a
								href="DeleteAdmin?userName=<c:out value='${user.userName}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>


			</table>
		</div>
	</div>
</body>

</html>