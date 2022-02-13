<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>USERS</title>
</head>
<body>
<table class="style">
    <caption class="heading">Users</caption>

        <tr>
            <th class="left-side">№</th>
            <th style="width: 100%">title</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>E-mail</th>
            <th colspan="2" class="right-side">action</th>
        </tr>
        <c:forEach var="user" items="${usersList}" varStatus="i">
            <tr>
                <td class="left-side">${i.index + 1 +10}</td>
                <td class="title">${user.userRole()}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td></td>
                <td>
                    <a href="/edit/${user.firstName}">
                        <span class="icon icon-edit"></span>
                    </a>
                </td>
                <td class="right-side">
                    <a href="/delete/${user.firstName}">
                        <span class="icon icon-delete"></span>
                    </a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="7" style="font-size: 150%" class="left-side right-side">
                the list is empty but you can add a new users
            </td>
        </tr>

    <tr>
        <td colspan="7" class="left-side link right-side">
            <a style="margin-right: 70px; font-size: 100%" href="<c:url value="/add"/>">
                <span class="icon icon-add"></span>Add new user
            </a>

        </td>
    </tr>
</table>
</body>
</html>


