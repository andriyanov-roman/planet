<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>

<div class="header">
    <div class="logo">
        <a href="/planet"><img src="${pageContext.request.contextPath}/img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <jsp:include page="login_form.jsp" />
    <div style="clear: both"></div>
	<%--
    <div class="hidden-login">
        <form id="login-form" method="post">
       		<input type="hidden" name="command" value="Log_In" />
            <span>Login:</span><br />
            <input type="text" name="name" placeholder="Name" required/><br>
            <span>Password:</span><br />
            <input type="password" name="password" placeholder="Password" required/><br>
            <a href="#passrec-form" class="passrec-popup">Forgot password?</a>
            <a href="../html/Registration-page.html" id="reg">Register</a>
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
    --%>
    <div class="lang-switcher">
        <img id="resultpic" src="img/ru_flag_icon.png" alt="Выбранная картинка" />
        <form action="">
            <select onchange="document.getElementById('resultpic').src = this.value">
                <option value="img/ru_flag_icon.png">RUS</option>
                <option value="img/uk_flag_icon.png">ENG</option>
                <option value="img/ukr_flag_icon.png">UKR</option>
            </select>
            <button id="lang-switch-btn">OK</button>
        </form>
    </div>
</div>