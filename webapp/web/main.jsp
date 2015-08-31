<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html lang="${Text['language']}">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/magnific-popup.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/menu_style.css" type="text/css" rel="stylesheet" />
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="js/js.cookie.js"></script>
        <title>Planet-shop</title>
    </head>
    <body>
    <tiles:insertDefinition name="myapp.homepage" />
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/common.js"></script>
    </body>
</html>
