<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%--    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>--%>
<%--    <link rel="icon" type="image/png" href="<c:url value="/res/favicon.png"/>"/>--%>
    <c:choose>
        <c:when test="${empty user.firstName}">
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
<form class="style" action="${empty user.firstName ? addUrl : editUrl}" name="film" method="POST">
    <c:choose>
        <c:when test="${!empty user.firstName}">
            <p class="heading">Edit film</p>
            <input type="hidden" name="id" value="${user.userId}">
        </c:when>
        <c:otherwise>
            <p class="heading">Add new film</p>
        </c:otherwise>
    </c:choose>
    <p><input type="text" name="title" placeholder="title" value="${user.lastName}" maxlength="100" required autofocus
              pattern="^[^\s]+(\s.*)?$">
    <p><input type="number" name="year" placeholder="year" value="${user.userRole()}" maxlength="4" required
              oninput="if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);">
    <p><input type="text" name="genre" placeholder="genre" value="${user.email}" maxlength="20" required>

    <p>
        <c:set value="add" var="add"/>
        <c:set value="edit" var="edit"/>
        <input type="submit" value="${empty user.firstName ? add : edit}">
    </p>
    <p class="heading">${message}</p>
</form>
</body>
</html>
