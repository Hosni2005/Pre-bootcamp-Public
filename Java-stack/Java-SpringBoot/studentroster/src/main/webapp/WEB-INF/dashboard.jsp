<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Dorms</h1>
	<a href="/dorms/new">Add a new dorm</a>
	<a href="/student/new">Add a new student</a>
	<table>
	<tr>
	<th>Dorm</th>
	<th>Action</th>
	</tr>
	<c:forEach var= i items = ${dorms} >
	<tr>
	<td>"${i.name}"</td>
	<td><a href="/dorms/{i.id}">See Students</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>