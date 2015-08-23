<%--
  Created by IntelliJ IDEA.
  User: randriyanov
  Date: 15.08.15
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="DiceFunctions" %>
<%@ taglib prefix="bc" uri="Test" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--<c:if test="${empty param.userName}">--%>
<%--<jsp:forward page="result.jsp"/>--%>
<%--</c:if>--%>
<c:out value='${mine:rollIt()}' escapeXml='true'/>
Hello ${param.userName}
${mine:rollIt()}
${mine:testing()}
<c:if test="${user.name eq 'Gena Sipakov'}" >
    <p>Hello Gena</p>
</c:if>
<c:out value="${user.name}" />
<c:forEach var="movie" items="${movieList}">
    <tr>
        <td>${movie}</td>
    </tr>
</c:forEach>
</body>
</html>
