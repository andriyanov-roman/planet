<%--
  Created by IntelliJ IDEA.
  User: oleksii
  Date: 26.08.15
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/FinReport", method="post">
  Begin date: <input type="date" name="beg_date" >
  End date: <input type="date" name="end_date" >
  <input type="submit">
</form>
</body>
</html>
