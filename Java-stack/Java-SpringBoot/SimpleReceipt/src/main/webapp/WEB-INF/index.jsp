<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Receipt</h1>

<table>

<tr>
    <td>Name</td>
    <td><c:out value="${name}"/></td>
</tr>

<tr>
    <td>Item Name</td>
    <td><c:out value="${itemName}"/></td>
</tr>

<tr>
    <td>Price</td>
    <td>$<c:out value="${price}"/></td>
</tr>

<tr>
    <td>Description</td>
    <td><c:out value="${description}"/></td>
</tr>

<tr>
    <td>Vendor</td>
    <td><c:out value="${vendor}"/></td>
</tr>

</table>
</body>
</html>