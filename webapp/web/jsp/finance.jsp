<%@ page import="planet.dao.FinReportDaoImpl" %>
<%@ page import="planet.entity.FinReport" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: oleksii
  Date: 19.08.15
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
  <%
      FinReportDaoImpl dao = new FinReportDaoImpl();
      List<FinReport> fr = new ArrayList<FinReport>();
      fr = dao.select();
  %>
  <c:forEach var="fr" items="${fr}">
    <tr>
      <td>${fr.orderDate}</td>
      <td>${fr.login}</td>
      <td>${fr.productName}</td>
      <td>${fr.productQty}</td>
      <td>${fr.amount}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
