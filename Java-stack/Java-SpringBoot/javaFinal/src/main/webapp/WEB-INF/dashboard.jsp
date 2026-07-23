<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard - Blog App</title>
</head>
<body>
<a href="/logout">Logout</a>

<h1>Welcome, <c:out value="${user.firstName}" />!</h1>

<h2>All Blogs</h2>
<a href="/create">+ Create Blog</a>

<c:choose>
    <c:when test="${empty allBlogs}">
        <p>No other blogs right now.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>Blog Title</th>
                <th>Author</th>
                <th>Created on</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="blog" items="${allBlogs}">
                <tr>
                    <td><c:out value="${blog.title}" /></td>
                    <td><c:out value="${blog.user.firstName}" /></td>
                    <td><c:out value="${blog.createdAt}" /></td>
                    <td><a href="/details/${blog.id}">Read</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

<h2>My Blogs</h2>
<c:choose>
    <c:when test="${empty myBlogs}">
        <p>You haven't created any blogs yet.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>Blog Title</th>
                <th>Author</th>
                <th>Created on</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="blog" items="${myBlogs}">
                <tr>
                    <td><c:out value="${blog.title}" /></td>
                    <td><c:out value="${blog.user.firstName}" /></td>
                    <td><c:out value="${blog.createdAt}" /></td>
                    <td>
                        <a href="/edit/${blog.id}">Edit</a> |
                        <a href="/delete/${blog.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

</body>
</html>
