<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Blog</title>
</head>
<body>

<h1>Edit Blog</h1>
<a href="/dashboard">back to dashboard</a>

<form:form action="/edit/${blog.id}" method="post" modelAttribute="blog">
    <form:hidden path="id" />

    <div>
        <form:label path="title">Blog Title</form:label>
        <form:input path="title" />
        <form:errors path="title" />
    </div>

    <div>
        <form:label path="category">Category</form:label>
        <form:input path="category" />
        <form:errors path="category" />
    </div>

    <div>
        <form:label path="content">Content</form:label>
        <form:textarea path="content" />
        <form:errors path="content" />
    </div>


    <a href="/dashboard"><button type="button">Cancel</button></a>
    <input type="submit" value="Save" />
</form:form>

</body>
</html>
