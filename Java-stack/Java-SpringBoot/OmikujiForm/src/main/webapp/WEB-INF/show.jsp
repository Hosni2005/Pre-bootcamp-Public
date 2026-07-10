<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Omikuji</title>

<link rel="stylesheet" href="/css/style.css">

</head>
<body>

<div class="fortune">

<h1>Here's Your Omikuji!</h1>

<div class="message">

<p>
In <strong>${number}</strong> years, you will live in
<strong>${city}</strong> with
<strong>${person}</strong> as your roommate,
selling <strong>${livingThing}</strong> for a living.

The next time you see a
<strong>${hobby}</strong>,
you will have good luck.

Also,
<strong>${nice}</strong>
</p>

</div>

<a href="/omikuji">Go Back</a>

</div>

</body>
</html>