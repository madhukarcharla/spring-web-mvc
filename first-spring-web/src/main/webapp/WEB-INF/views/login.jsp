<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Login Page</title>
<style>
.error {
	color: red
}
</style>
</head>

<body>
	<form:form id="regForm" modelAttribute="user" action="loginProcess"
		method="post">
		<c:if test="${displayMessage}">
			<h1>Registration Completed for: ${user.fullName} - Please try
				logging In</h1>				
		</c:if>
	
		<table align="center">
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
				<td>
				<form:hidden path="fullName" name="fullName" id="fullName" />
				<form:hidden path="phoneNumber" name="phoneNumber" id="phoneNumber" />
				</td>
				<td><form:button id="login" name="login">Log In</form:button></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>