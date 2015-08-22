<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<div class="header">
    <div class="logo">
    </div>
    <div class="login">
        ${Text['HELLO']},
        <a href="#login-form" class="login-popup"><img src="../img/user_icon.png" alt="user icon" /><span>login to personal cabinet</span></a>
    </div>
    <div class="hidden-login">
        <form id="login-form" method="post" action="login">
            <span>Login:</span><br />
            <input type="text" name="name" placeholder="Name" required/><br>
            <span>Password:</span><br />
            <input type="password" name="password" placeholder="Password" required/><br>
            <a href="#passrec-form" class="passrec-popup">Forgot password?</a>
            <a href="../jsp/reg-page.jsp" id="reg">Register</a>
            <input type="submit" class="log-reg-buttons" id="login-btn" value="Log In"/>
        </form>
    </div>
    <div class="hidden-passrecovery">
        <form id="passrec-form" method="post" action="#">
            <span>Напомнить пароль</span>
            <input type="email" name="email" placeholder="email" required/><br>
            <p>Введите адрес почты, который вы указывали при регистрации, на этот адрес отправим пароль.</p>
            <input type="submit" class="log-reg-buttons" id="passrec-btn" value="Отправить"/>
        </form>
    </div>
</div>