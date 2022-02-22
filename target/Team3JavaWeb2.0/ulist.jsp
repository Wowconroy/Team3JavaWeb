<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP List Users Records</title>
</head>
<body>
<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://45.84.206.101:3306/u417527816_okko_audit"
        user="u417527816_maks" password="Library2022"
/>

<sql:query var="listUsers"	dataSource="${myDS}">
    SELECT * FROM user;
</sql:query>
<sql:query var="listUsers"	dataSource="${myDS}">
     * FROM user;
</sql:query>

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
        </tr>
        <c:forEach var="user" items="${listUsers.rows}">
            <tr>
                <td><c:out value="${user.user_id}" /></td>
                <td><c:out value="${user.first_name}" /></td>
                <td><c:out value="${user.last_name}" /></td>
                <td><c:out value="${user.date_of_birth}" /></td>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.password}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>