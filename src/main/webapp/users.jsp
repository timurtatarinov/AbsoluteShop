<%@ page import="java.util.List" %>
<%@ page import="ua.absoluteshop.tatarinov.model.User" %>
<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: ttrnv
  Date: 06.08.2023
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>All Users</title>

</head>

<body>


<%
    PrintWriter printWriter = response.getWriter();
    printWriter.write("<table border=1>\n" +
            "    <tr>\n" +
            "        <th>Email</th>\n" +
            "        <th>Password</th>\n" +
            "    </tr>");

    List<User> allUsers  = (List<User>) request.getAttribute("allUsers");
    for( User user : allUsers){
        printWriter.write("<tr>");
        printWriter.write("<td>" + user.getEmail() + "</td>");
        printWriter.write("<td>" + user.getPassword() + "</td>");
        printWriter.write("</tr>");
    }
%>

</body>

</html>