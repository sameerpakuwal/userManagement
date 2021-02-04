<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<div>
	<div class = "col-mb-8">User List</div>
		<div class = "col-md-2">
			<a href="add" class="btn btn-primary">Add User</a>
		</div>
	</div>
	
	<c:if test="${!empty users}">
		<div>
			<table class="table table-striped ">
				<thead>
					<tr>
						<th>User id</th>
						<th>User Name</th>
						<th>Password</th>
						<th>DOB</th>
						<th>Email</th>
						<th>Mobile No</th>
						<th>Gender</th>
						<th>Nationality</th>
						<th>Hobbies</th>
						<th>Comments</th>
						<th>Address</th>
						<th>Actions</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.id}</td>
							<td>${user.username}</td>
							<td>${user.password}</td>
							<td>${user.dob}</td>
							<td>${user.email}</td>
							<td>${user.mobileNo}</td>
							<td>${user.gender}</td>
							<td>${user.nationality}</td>
							<td>${user.hobbies}</td>
							<td>${user.address}</td>
							<td>${user.comments}</td>
							<td><a href="delete_user?id=${user.id}">DELETE</a> <a
								href="edit_user?id=${user.id}">EDIT</a></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>
</body>
</html>