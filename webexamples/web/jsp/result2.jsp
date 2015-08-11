<html><body>
<jsp:useBean id="person" type="planet.entities.Employee" class="planet.entities.Employee" >
<jsp:setProperty name="person" property="*" />
</jsp:useBean>
Person is: <jsp:getProperty name="person" property="name" />
ID is: <jsp:getProperty name="person" property="id" />
</body></html>