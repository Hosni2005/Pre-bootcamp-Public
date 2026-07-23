<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog : <c:out value="${blog.title}" /></title>
</head>
<body>
<h1>Blog : <c:out value="${blog.title}" /></h1>
<a href="/details/${blog.id}">back to blog</a>
<p>Author: <c:out value="${blog.user.firstName}" /></p>
<h2>Comments </h2>
<c:choose>
    <c:when test="${empty comments}">
        <p>No comments yet.</p>
    </c:when>
    <c:otherwise>
        <c:forEach var="comment" items="${comments}">
            <p>
                <strong><c:out value="${comment.user.firstName}" /></strong>:
                <c:out value="${comment.content}" />
            </p>
        </c:forEach>
    </c:otherwise>
</c:choose>
</body>
</html>