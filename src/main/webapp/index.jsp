<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<h2>Login</h2>
<form method="POST" action="/home">
    Login:
    <input type="text" placeholder="Login" name="login">
    Password:
    <input type="text" placeholder="Password" name="password">
    <hr>
    <input type="submit" class="baton" value="LogIn"> or <b><a href="../reg.jsp"><input type="button" class="baton" value="SignIn"></a></b>
</form>
<b><a href="../admin.jsp"><input type="button" class="baton" value="admin"></a></b>
</body>
</html>
