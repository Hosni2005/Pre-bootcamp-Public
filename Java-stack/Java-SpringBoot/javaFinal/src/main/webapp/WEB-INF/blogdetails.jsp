<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Blog: <c:out value="${blog.title}" /></title>
</head>
<body>
<a href="/logout">Logout</a>

<h1>Blog Details</h1>
<a href="/dashboard">back to dashboard</a>

<p>Title: <c:out value="${blog.title}" /></p>
<p>Author: <c:out value="${blog.user.firstName}" /> <c:out value="${blog.user.lastName}" /></p>
<p>Category: <c:out value="${blog.category}" /></p>
<p>Tags: <c:out value="${blog.tags}" /></p>
<p>Content:</p>
<p><c:out value="${blog.content}" /></p>

<c:if test="${blog.user.id == user.id}">
    <a href="/edit/${blog.id}"><button type="button">Edit</button></a>
    <a href="/delete/${blog.id}"><button type="button">Delete</button></a>
</c:if>

<p><a href="/details/${blog.id}/comments">Comments</a></p>

</body>
</html>
