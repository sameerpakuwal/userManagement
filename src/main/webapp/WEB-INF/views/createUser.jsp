<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<%@ include file = "header.jsp" %>
</head>
<body>
	<div>
		<form action="save_user" method="post">
	</div>
	<div>
		<label>User Name</label>
		<input type="text" name="username">
	</div>
	
	<div>
		<label>Password</label>
		<input type="password" name="password">
	</div>
	<div>
		<label>dob</label>
		<input type="date" name="dob">
	</div>
	<div>
		<label>Email</label>
		<input type="email" name="email">
	</div>
	<div>
		<label>Mobile No</label>
		<input type="number" name="mobileNo">
	</div>
	<div>
		<label>Address</label>
		<input type="text" name="address">
	</div>
	<div>
		<label>Gender</label>
		<input type="radio" name="gender" value ="Male">Male
		<input type="radio" name="gender" value ="Female">Female
		
	</div>
	<div>
		<label>Hobbies</label>
		<input type="checkbox" name="hobbies" value = "swimming">swimming
		<input type="checkbox" name="hobbies" value = "chess">chess
	</div>
	<div>
	<label>Nationality</label>
		<select name =  "nationality">
		
		<option value  =  "Nepalese"> Nepalese </option>
		<option value  =  "Indian"> Indian </option>
		<option value  =  "American"> American </option>
		
		</select>
	</div>
	<div>
	
	<label>Comments</label>
	<textarea rows="6" cols="30"  name =  "comments"></textarea>
	</div>
	
	<div>
	<input type ="submit" value =  "Submit">
	</div>
</body>
</html>