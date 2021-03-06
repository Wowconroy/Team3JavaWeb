<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
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

</head>
<body>
<a href="../blist.jsp"><input type="button" value="Book list"></a></b>
<a href="../alist.jsp"><input type="button" value="Author list"></a></b>
<a href="../tlist.jsp"><input type="button" value="Title list"></a></b>
<a href="../ulist.jsp"><input type="button" value="Users list"></a></b>
<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://45.84.206.101:3306/u417527816_okko_audit"
        user="u417527816_maks" password="Library2022"
/>

<sql:query var="listUsers"	dataSource="${myDS}">
    SELECT * FROM user;
</sql:query>
<sql:update var="deleteUsers"	dataSource="${myDS}">

    DELETE FROM `user` WHERE `user`.`user_id` = ?;
    <sql:param value = "${empId}" />
</sql:update>



<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Birth date</th>
            <th>Email</th>
            <th>Password</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="user" items="${listUsers.rows}">

            <tr>
                <td><c:out value="${user.user_id}" /></td>
                <td><c:out value="${user.first_name}" /></td>
                <td><c:out value="${user.last_name}" /></td>
                <td><c:out value="${user.date_of_birth}" /></td>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.password}" /></td>
                <td><input type="button" value="Edit"></td>
                <td><input type="button" value="Delete"><c:set var = "empId" value = "${user.user_id}"/></td>
            </tr>

        </c:forEach>
    </table>
</div>
</body>
</html>