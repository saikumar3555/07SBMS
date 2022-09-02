<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="/submitForm" method="post" modelAttribute="user">
<tr>
 <td>User ID </td>
 <td><form:input path="userId"/></td>
</tr>

<tr>
 <td>Usr Name </td>
 <td><form:input path="userName"/></td>
</tr>

<tr>
 <td>User Phone No</td>
 <td><form:input path="userPhno"/></td>
</tr>

<tr>
 <td><input type="submit" value="Save USer"/></td>
</tr>



</form:form>
</body>
</html>