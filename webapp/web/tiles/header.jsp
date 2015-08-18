<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<div class="header">
    <div class="logo">
        <a href="../Main.html"><img src="../img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <div class="login">
        Hello,
        <a href="#login-form" class="login-popup"><img src="../img/user_icon.png" alt="user icon" /><span>login to personal cabinet</span></a>
    </div>
    <div class="hidden-login">
        <form id="login-form" method="post" action="login">
            <span>Login:</span><br />
            <input type="text" name="name" placeholder="Name" required/><br>
            <span>Password:</span><br />
            <input type="password" name="password" placeholder="Password" required/><br>
            <a href="#">Forgot password?</a>
            <a href="../html/Registration-page.html" id="reg">Register</a>
            <input type="submit" class="log-reg-buttons" id="login-btn" value="Log In"/>
        </form>
    </div>
</div>