<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Personal cabinet</title>
        <link href="../css/style.css" type="text/css" rel="stylesheet" />
        <link href="../css/magnific-popup.css" type="text/css" rel="stylesheet" />
        <link href="../css/menu_style.css" type="text/css" rel="stylesheet" />
        <link href="../css/pers_cabinet.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <tiles:insertDefinition name="myapp.personal-cabinet" />
        <script src="../js/jquery-1.11.1.min.js"></script>
        <script src="../js/jquery.magnific-popup.min.js"></script>
        <script src="../js/common.js"></script>
    </body>
</html>
