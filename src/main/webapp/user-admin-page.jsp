<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin page</title>
</head>
<body bgcolor="aqua">

<center>
    <h1> Success login!!! </h1>
</center>

<%
    Integer countUserEnterToLogin = (Integer) session.getAttribute("count");
    if (countUserEnterToLogin != null) {
        out.println("<h2> count = " + countUserEnterToLogin + "</h2>");
    }
%>

<ul>
    <li>Вывести все товары</li>
    <li>Добавить товар</li>
    <li><a href="/users"></a>Вывести всех пользователей</li>
    <li>Добавить пользователя</li>
</ul>

</body>
</html>