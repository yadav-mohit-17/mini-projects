<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset=UTF-8">
<title>Save Data</title>
</head>
<body>

	<h2>Save Contact</h2>

	<p>
		<font color="green">${succMsg}</font>
	</p>
	<p>
		<font color="red">${errMsg}</font>
	</p>
	<form:form action="/saveContact" method="post" modelAttribute="contact">
		<table>
			<tr>
				<form:hidden path="contactId"/>
				
				<td>Contact Name :</td>
				<td><form:input path="contactName" /></td>
			</tr>

			<tr>
				<td>Contact Email :</td>
				<td><form:input path="contactEmail" /></td>
			</tr>

			<tr>
				<td>Contact Number :</td>
				<td><form:input type="text" path="contactNumber" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	<a href="viewContacts"> view All Contacts</a>
</body>

</html>