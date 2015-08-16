<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<jsp:useBean id="profile" class="profile.Profile" scope="request"/>
<head>
    <title>Profile page</title>
</head>
<body>

<h1><jsp:getProperty name="profile" property="login"/> profile</h1>

<h3>Maybe you want this:</h3>
<c:forEach items="${profile.suggestedGoods}" var="suggestedProduct">
    <c:url var="productURL" value="/ProductServlet">
        <c:param name="id" value="${suggestedProduct.id}"/>
    </c:url>
    <p><a  href="${productURL}"> ${suggestedProduct.name}</a></p>
</c:forEach>

</body>
</html>
