<html>
<jsp:useBean id="user" class="planet.entities.User" scope="request"/>

<body>
Hello <jsp:getProperty name="user" property="name"/>
Test : ${user.name}
TestMap: ${map['Key']}
Emplyee: ${emplyee.name}
${array[0]}
${array[1]}
${array[2]}
</body>
</html>