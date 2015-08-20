<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<div class="registration">
    <p>Регистрация</p><hr />
    <form id="reg-form" method="post">
        <span>Введите Ваше имя:</span><br />
        <input type="text" name="reg-name" required/><br />
        <span>Введите Ваш email:</span><br />
        <input type="email" name="reg-email" required/><br />
        <span>Введите Ваш пароль:</span><br />
        <input type="password" name="reg-password" required/><br />
        <span>Повторите пароль:</span><br />
        <input type="password" name="reg-repassword" required/><br />
        <input id="reg-checkbox" type="checkbox" name="reg-licenceAgree" required/>
        <span>Я принимаю <a href="#">пользовательское соглашение.</a></span><br />
        <input type="submit" class="log-reg-buttons" id="reg-btn" value="Зарегистрироваться"/>
    </form>
</div>