<%--
  Created by IntelliJ IDEA.
  User: randriyanov
  Date: 09.08.15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="planet.entities.Counter" %>
<html>
<head>
    <title></title>
</head>
<% Counter.getCounter(); %>
<form action="mainServlet.do" method="POST">
    First Name: <input type="text" name="first_name">
    <br/>
    Last Name: <input type="text" name="last_name"/>
    <input type="submit" value="Submit"/>
</form>
</html>
