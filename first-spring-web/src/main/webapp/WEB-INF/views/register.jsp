<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
.error {
	color: red
}
</style>
</head>

<body>
	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="fullName">Full Name</form:label></td>
				<td><form:input path="fullName" name="fullName" id="fullName" /></td>
				<td><form:errors path="fullName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="userName">User Name</form:label></td>
				<td><form:input path="userName" name="userName" id="userName" />
				</td>
				<td><form:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber">Phone Number</form:label></td>
				<td><form:input path="phoneNumber" name="phoneNumber"
						id="phoneNumber" /></td>
				<td><form:errors path="phoneNumber" cssClass="error" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button>
				</td>
				<td></td>
			</tr>
			<tr></tr> 
		</table>
	</form:form>

</body>

</html>