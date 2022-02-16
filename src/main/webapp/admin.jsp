<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<h2>Admin</h2>
<form method="POST" action="/addbook.jsp">
    <b><a href="../addbook.jsp"><input type="button" class="baton" value="Add new book"></a></b>
</form>
<form method="POST" action="/home.jsp">
    <input type="button" class="baton" value="Book list">
    <input type="button" class="baton" value="User list">
</form>
</body>
</html>
