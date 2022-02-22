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

        input[type=submit], input[type=button]{
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

        tbody tr:nth-child(odd) {
            background-color: #cbcbcb;
        }

        tbody tr:nth-child(even) {
            background-color: #bbbbbb;
        }

        tbody tr {
            background-color: #000000;
        }

        table {
            background-color: #e0e0e0;
        }

    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP List Users Records</title>
</head>
<body>
<h2>Home</h2>

<a href="../blist.jsp"><input type="button" value="Book list"></a></b>
<a href="../alist.jsp"><input type="button" value="Author list"></a></b>
<a href="../tlist.jsp"><input type="button" value="Title list"></a></b>
<a href="../ulist.jsp"><input type="button" value="Users list"></a></b>

</body>
</html>
