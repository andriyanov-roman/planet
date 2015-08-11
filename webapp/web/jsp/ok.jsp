<%@ page import="planet.foo.*" %>
<%@ page import="profile.Profile" %>
<html>
<div align="center">
    <p>HELLO, USER</p>

    <p>${param["name"]}</p>

    <p>WITH, PROFILE</p>

    <p>${param["name"]}</p>

    <p><%
        Profile profile = (Profile) session.getAttribute("profile");
        System.out.println(profile.getLogin());
    %></p>

    <%= Counter.getCount() %>
</div>
</body>
</html>
