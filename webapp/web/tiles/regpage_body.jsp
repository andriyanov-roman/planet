<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<!-- vertical-align: baseline; -->
<div class="registration">
    <div><p>${Text["HEADER_REGISTER"]}</p><hr /></div>
    <div id="reg_error"></div>
    <form id="reg-form" method="post" onsubmit="return check_register_form()">
        <span>${Text["HEADER_ENTEREMAIL"]}</span><br />
        <input type="email" name="reg-email" required/><br />
        <span>${Text["HEADER_ENTERPASS"]}</span><br />
        <input id="password" type="password" name="password" required/><br />
        <span>${Text["HEADER_REPEATPASS"]}</span><br />
        <input id="password2" type="password" name="password" required/><br />
        <div><input type="submit" class="log-reg-buttons" id="reg-btn" value="${Text["HEADER_REGISTER"]}"></div>
    </form>
</div>