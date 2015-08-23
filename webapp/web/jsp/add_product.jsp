<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="planet.entity.Product" %>

<%--
  Created by IntelliJ IDEA.
  User: okova
  Date: 22.08.2015
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="product" class="planet.entity.Product" scope="session"/>
<head>
    <title>Add product page</title>
</head>
<body>

Integer category_id = new Integer(request.getParameter("category_id"));
String name = request.getParameter("name");
String price = request.getParameter("price");

product(category_id.intValue(), name, price);

<form>
    <table width="352" border="1">
        <tr>
            <th>Category_id</th>
            <td><input name="category_id" type="number"></td>
        </tr>
        <tr>
            <th> Name </th>
            <td><input name="name" type="text"></td>
        </tr>
        <tr>
            <th>Price </th>
            <td><input name="price" type="text"></td>
        </tr>
        <tr>
            <th colspan="2"><input type="submit"value="Submit" >
            </th>
        </tr>
    </table>
</form>
.
</body>
</html>
