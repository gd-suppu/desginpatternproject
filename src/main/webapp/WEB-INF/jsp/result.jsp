<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Greatest Number Result</title>
</head>
<body>
    <h1>Greatest Number Result</h1>
    <p>Number 1: <span th:text="${c.num1}"></span></p>
    <p>Number 2: <span th:text="${c.num2}"></span></p>
    <p>Greatest Number: <span th:text="${greatest}"></span></p>
</body>
</html>
