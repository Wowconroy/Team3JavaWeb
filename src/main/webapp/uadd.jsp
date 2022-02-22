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


<sql:update var="addUsers"	dataSource="${myDS}">
    INSERT INTO `user` (`user_id`, `first_name`, `role_id`, `last_name`, `email`, `password`, `date_of_birth`, `registration_date`) VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, current_timestamp());
</sql:update>


</body>
</html>