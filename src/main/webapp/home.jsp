<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<h2>Home</h2>
<form method="POST" action="/home.jsp">
    Search Book:
    <input type="text" placeholder="search" name="search">
    Search Author:
    <input type="text" placeholder="search" name="search_author">
    <input type="button" class="baton" value="Most popular">
</form>
</body>
</html>
