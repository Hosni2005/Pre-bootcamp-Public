<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Book details</h1>
	
	<p>
	title : ${book.title}
	</p>
	<p>
	description : ${book.description}
	</p>
	<p>
	language : ${book.language}
	</p>
	<p>
	pages : ${book.numberOfPages}
	</p>
</body>
</html>