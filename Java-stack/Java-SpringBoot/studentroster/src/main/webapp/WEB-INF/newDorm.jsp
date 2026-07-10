<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>New Dorm</h1>
<a href = "/dashboard">Dashboard</a>
<form:form action="/dashboard" method = "post" modelAttribute="">
<form:label path = "dormName" for="name">Name :</form:label>
<form:input type = "text" path="dormName" id="dormName" />
<form:erorrs path = "dormName" />
<button type="submit">Add</button>
</form:form>
</body>
</html>