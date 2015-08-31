<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
Period from ${param.beg_date} to ${param.end_date}:

<table border="1">
  <tr>
    <td>Дата заказа</td>
    <td>Логин</td>
    <td>Продукт</td>
    <td>Количество</td>
    <td>Сумма</td>
  </tr>
  <c:forEach var="fr" items="${FinReportList}">
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
