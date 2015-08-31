<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>

<div class="header">
    <div class="logo">
        <a href="/planet"><img src="${pageContext.request.contextPath}/img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <jsp:include page="login_form.jsp" />
    <div style="clear: both"></div>
    <div class="hidden-passrecovery">
	<div id="reg-form" class="registration">
		<div>
			<p>Регистрация</p>
			<hr />
		</div>
		<div id="reg_error"></div>
		<form  method="post"
			onsubmit="return check_register_form()">
			<span>Введите Ваш email:</span><br /> <input type="email"
				name="reg-email" required /><br /> <span>Введите Ваш пароль:</span><br />
			<input id="password" type="password" name="password" required /><br />
			<span>Повторите пароль:</span><br /> <input id="password2"
				type="password" name="password" required /><br />
			<div>
				<input type="submit" class="log-reg-buttons" id="reg-btn"
					value="Зарегистрироваться">
			</div>
		</form>
	</div>
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
