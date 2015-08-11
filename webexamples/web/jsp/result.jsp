<html>
<jsp:useBean id="user" class="planet.entities.User" scope="request"/>
<body>
Hello <jsp:getProperty name="user" property="name"/>
</body>
</html>