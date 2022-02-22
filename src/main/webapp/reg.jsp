<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <style type="text/css">
        @import url('https://fonts.googleapis.com/css?family=Khula&display=swap');

        body {
            color: #000;
            font-family: 'Khula', sans-serif;
            background-color: #fff;
            text-align: center;
            margin: 0;
            height: 100vh;
            overflow: hidden;
        }

        .tname {
            display: inline;
            background-color: #fff;
            box-shadow: -10px 0 0 #aaa, 10px 0 0 #aaa;
            padding: 10px 0;
            font-size: 4rem;
            color: #000;
            justify-content: center;
            align-items: center;
            position: relative;
        }

        .baton {
            background-color: gray;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }

        input[type=text], input[type=email], input[type=password], input[type=date] {
            background-color: #ddd;
            color: black;
            border: none;
        }

    </style>
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
