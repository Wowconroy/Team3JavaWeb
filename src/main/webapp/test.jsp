<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <c:choose>
        <c:when test="${empty user.title}">
            <title>Add</title>
        </c:when>
        <c:otherwise>
            <title>Edit</title>
        </c:otherwise>
    </c:choose>
</head>
<body>
<c:url value="/add" var="addUrl"/>
<c:url value="/edit" var="editUrl"/>
<form class="style" action="${empty user}" name="film" method="POST">
    <c:choose>
        <c:when test="${!empty user.title}">
            <p class="heading">Edit user</p>
            <input type="hidden" name="id" value="${user.user_id}">
        </c:when>
        <c:otherwise>
            <p class="heading">Add new user</p>
        </c:otherwise>
    </c:choose>
    <p><input type="text" name="title" placeholder="Name" value="${user.first_name}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">
    <p><input type="text" name="title" placeholder="Surname" value="${user.last_name}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">
    <p><input type="text" name="title" placeholder="Birth date" value="${user.date_of_birth}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">
    <p><input type="text" name="title" placeholder="Login" value="${user.email}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">
    <p><input type="text" name="title" placeholder="Password" value="${user.password}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">

    <p>
        <c:set value="add" var="add"/>
        <c:set value="edit" var="edit"/>
        <input type="submit" value="${empty user.title ? add : edit}">
    </p>
    <p class="heading">${message}</p>
</form>
</body>
</html>
