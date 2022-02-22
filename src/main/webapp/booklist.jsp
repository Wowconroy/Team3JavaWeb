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

        input[type=text], input[type=email], input[type=password] {
            background-color: #ddd;
            color: black;
            border: none;
        }

        tbody tr:nth-child(odd) {
            background-color: #cbcbcb;
        }

        tbody tr:nth-child(even) {
            background-color: #a4a4a4;
        }

        tbody tr {
            background-color: #000000;
        }

        table {
            background-color: #a1a1a1;
        }

    </style>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<div class="container">
    <a href="/"><br>Home</a>
    <h2><br>List of users</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Id</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Age</th>
            <th scope="col">Reg Date</th>
            <th colspan="2">Operations</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="user, el: ${users}">
            <td th:text="${el.index + 1}"></td>
            <td th:text="${user.id}"></td>
            <td th:text="${user.firstName}"></td>
            <td th:text="${user.lastName}"></td>
            <td th:text="${user.age}"></td>
            <td th:text="${user.registrationDate}"></td>
            <td>
                <a th:href="@{|/users/update/${user.getId()}|}">Update</a>
            </td>
            <td>
                <a th:href="@{|/users/remove/${user.getId()}|}">Delete</a>
            </td>
        </tr>
        </tbody>
    </table>
    <span>
           <a th:href="@{|/users/add|}">Add new user</a>
    </span>
</div>
