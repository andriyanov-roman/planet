<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<div class="header">
    <div class="logo">
        <a href="../main.jsp"><img src="../img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <div class="login">
        ${Text['HEADER_HELLO']},
        <a href="#login-form" class="login-popup"><img src="../img/user_icon.png" alt="user icon" /><span>${Text['HEADER_LOGTOCAB']}</span></a>
    </div>
    <div class="hidden-login">
        <form id="login-form" method="post" action="login">
            <span>${Text['HEADER_LOGIN']}</span><br />
            <input type="text" name="name" placeholder="${Text['PLACEHOLDER_NAME']}" required/><br>
            <span>${Text['HEADER_PASSWORD']}</span><br />
            <input type="password" name="password" placeholder="${Text['PLACEHOLDER_PASS']}" required/><br>
            <a href="#passrec-form" class="passrec-popup">${Text['HEADER_FORGOTPASS']}</a>
            <a href="../jsp/reg-page.jsp" id="reg">${Text['HEADER_REGISTER']}</a>
            <input type="submit" class="log-reg-buttons" id="login-btn" value="${Text['HEADER_BT_LOGIN']}"/>
        </form>
    </div>
    <div class="hidden-passrecovery">
        <form id="passrec-form" method="post" action="#">
            <span>${Text['HEADER_REMINDPASS']}</span>
            <input type="email" name="email" placeholder="email" required/><br>
            <p>${Text['HEADER_REGMAILTOSEND']}</p>
            <input type="submit" class="log-reg-buttons" id="passrec-btn" value="Отправить"/>
        </form>
    </div>
</div>