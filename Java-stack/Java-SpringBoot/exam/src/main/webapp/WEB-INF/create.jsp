<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Book</title>
</head>
<body>

<h1>Add a Book to Your Shelf!</h1>
<a href="/projects">back to the shelves</a>

<form:form action="/projects/create/new" method="post" modelAttribute="blogs">
    <div>
        <form:label path="blogTitle">Blog Title</form:label>
        <form:input path="blogTitle" />
        <form:errors path="blogTitle" />
    </div>

<%--        <form:label path= "leaderName">Author</form:label>--%>
<%--        <form:input path= "leaderName" readonly="true" value="${user.userName}" />--%>
<%--        <form:errors path="leaderName" />--%>

    <div>
        <form:label path="category">category</form:label>
        <form:input  path="category" />
        <form:errors path="category" />
    </div>

    <div>
        <form:label path="content">content</form:label>
        <form:textarea path="content" />
        <form:errors path="content" />
    </div>
	<button href="/dashboard">cancel</button>
    <button type="submit">Save</button>
</form:form>

</body>
</html>