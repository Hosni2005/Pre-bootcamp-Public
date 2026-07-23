<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Blog App - Login and Registration</title>
    <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@700;800&family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Inter', sans-serif;
            background: #faf5ec;
            color: #0e1c2f;
            min-height: 100vh;
        }

        .hero {
            background: #0e1c2f;
            color: #fff;
            padding: 64px 8vw 72px;
        }

        .eyebrow {
            color: #f2d383;
            font-size: 12px;
            font-weight: 700;
            letter-spacing: 3px;
            text-transform: uppercase;
            margin-bottom: 14px;
        }

        .hero h1 {
            font-family: 'Playfair Display', serif;
            font-size: 52px;
            line-height: 1.1;
            margin-bottom: 16px;
        }

        .hero p {
            color: #c7cdd6;
            max-width: 430px;
            line-height: 1.6;
        }

        .cards {
            display: flex;
            flex-wrap: wrap;
            gap: 28px;
            padding: 48px 8vw 80px;
        }

        .card {
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(14, 28, 47, 0.08);
            padding: 30px 28px 34px;
            width: 380px;
            border-top: 6px solid #f2d383;
        }

        .card.green {
            border-top-color: #7d9471;
        }

        .card .eyebrow {
            color: #b3432b;
            margin-bottom: 8px;
        }

        .card h2 {
            font-family: 'Playfair Display', serif;
            font-size: 30px;
            margin-bottom: 22px;
        }

        label {
            display: block;
            font-size: 14px;
            font-weight: 600;
            margin: 16px 0 6px;
        }

        input[type="text"],
        input[type="password"],
        input[type="email"] {
            width: 100%;
            padding: 12px 14px;
            font-size: 15px;
            font-family: 'Inter', sans-serif;
            border: 1px solid #dcd6c9;
            border-radius: 8px;
            background: #fff;
            outline: none;
        }

        input[type="text"]:focus,
        input[type="password"]:focus,
        input[type="email"]:focus {
            border-color: #0e1c2f;
        }

        .error {
            display: block;
            color: #b3432b;
            font-size: 13px;
            margin-top: 5px;
        }

        input[type="submit"] {
            width: 100%;
            margin-top: 24px;
            padding: 14px;
            font-size: 15px;
            font-weight: 700;
            font-family: 'Inter', sans-serif;
            color: #fff;
            background: #0e1c2f;
            border: none;
            border-radius: 8px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background: #1c2f4a;
        }
    </style>
</head>
<body>

<div class="hero">
    <div class="eyebrow">Login &amp; Registration</div>
    <h1>Welcome to Blog App!</h1>
    <p>Register or log in to read and write blogs.</p>
</div>

<div class="cards">

    <%-- Registration card --%>
    <div class="card">
        <div class="eyebrow">New member</div>
        <h2>Register</h2>

        <form:form 
            action="${pageContext.request.contextPath}/register" 
            method="post" 
            modelAttribute="newUser">

            <form:label path="firstName">First name</form:label>
            <form:input path="firstName" placeholder="e.g. Jonathan" />
            <form:errors path="firstName" cssClass="error" />

            <form:label path="lastName">Last name</form:label>
            <form:input path="lastName" placeholder="e.g. Anderson" />
            <form:errors path="lastName" cssClass="error" />

            <form:label path="email">Email</form:label>
            <form:input path="email" placeholder="e.g. jane@email.com" />
            <form:errors path="email" cssClass="error" />

            <form:label path="password">Password</form:label>
            <form:password path="password" />
            <form:errors path="password" cssClass="error" />

            <form:label path="confirm">Confirm PW</form:label>
            <form:password path="confirm" />
            <form:errors path="confirm" cssClass="error" />

            <input type="submit" value="Submit" />

        </form:form>
    </div>



    <%-- Login card --%>
    <div class="card green">
        <div class="eyebrow">Returning member</div>
        <h2>Log in</h2>

        <form:form 
            action="${pageContext.request.contextPath}/login" 
            method="post" 
            modelAttribute="newLogin">

            <form:label path="email">Email</form:label>
            <form:input path="email" placeholder="e.g. jane@email.com" />
            <form:errors path="email" cssClass="error" />

            <form:label path="password">Password</form:label>
            <form:password path="password" />
            <form:errors path="password" cssClass="error" />

            <input type="submit" value="Submit" />

        </form:form>

    </div>

</div>

</body>
</html>
