<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="<c:url value="res/style.css"/>" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<h2>Registration</h2>
<form method="POST" action="/addbook.jsp">
    Title:
    <input type="text" placeholder="Title" name="name"><br>
    Author:
    <input type="text" placeholder="Author" name="name"><br>
    Genre:
    <input type="text" placeholder="Genre" name="name"><br>
    Year:
    <input type="date" placeholder="Year" name="age"><br>
    <hr>
    <input type="submit" class="baton" value="Add">
</form>
<b><a href="../admin.jsp"><input type="button" class="baton" value="back"></a></b>
</body>
</html>
