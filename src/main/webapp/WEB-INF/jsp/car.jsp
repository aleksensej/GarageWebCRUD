<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Management</title>
</head>
<body>
<h1>Car Data</h1>
<form:form action="car.do" method="POST" commandName="car">
	<table>
		<tr>
			<td>Car Licence plate</td>
			<td><form:input path="LicencePlate" /></td>
		</tr>
		<tr>
			<td>Car Type</td>
			<td><form:input path="CarType" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add">
				<input type="submit" name="action" value="Edit">
				<input type="submit" name="action" value="Search">
			</td>	
		</tr>
	</table>
</form:form>
</body>
</html>