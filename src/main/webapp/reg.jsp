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
<form method="POST" action="/index.jsp">
    Enter your name:
    <input type="text" placeholder="Name" name="name"><br>
    Enter your login:
    <input type="email" placeholder="Login" name="login"><br>
    Enter your password:
    <input type="password" placeholder="Password" name="password"><br>
    Enter your age:
    <input type="date" placeholder="Age" name="age"><br>
    <hr>
    <input type="submit" class="baton" value="Register">
</form>
<b><a href="../index.jsp"><input type="button" class="baton" value="go to index"></a></b>
</body>
</html>
