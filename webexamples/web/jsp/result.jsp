<html>
<jsp:useBean id="user" class="planet.entities.User" scope="request"/>

<body>
Hello <jsp:getProperty name="user" property="name"/>
Test : ${user.name}
TestMap: ${map['Key']}
</body>
</html>