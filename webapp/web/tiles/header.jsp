<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>

<div class="header">
	<div class="top-menu">
		<ul class="top-menu-list">
			<div class="delivery-icon">
				<a href="#"><li>Delivery</li></a>
			</div>
			<div class="payment-icon">
				<a href="#"><li>Payment</li></a>
			</div>
			<div class="about_us-icon">
				<a href="#"><li>About us</li></a>
			</div>
			<div class="our_stores-icon">
				<a href="#"><li>Our stores</li></a>
			</div>
			<div class="contacts-icon">
				<a href="#"><li>Contacts</li></a>
			</div>
		</ul>
		<div class="lang-switcher">
			<form id="lang_form" method="post">
				<img id="resultpic" src="${Text['FLAG_LOCATION']}" alt="Выбранная картинка" />
				<input type="hidden" name="command" value="lang" />
				<input id="select_input" type="hidden" name="lang" value="" />
				<input type="submit" style="display: none"/>
				<select onchange="select_lang(this.options[this.selectedIndex].id)">
					<option id="ru">RUS</option>
					<option id="en">ENG</option>
					<!--     <option id="ua" value="img/ukr_flag_icon.png">UKR</option> -->
				</select>
			</form>
		</div>
		<div class="login_btn">
			<a href="#loginform" class="login-popup"><input class="loginButton" id="main_login_btn" type="submit" value="Войти в кабинет" /></a>
		</div>
	</div>
    <div class="logo">
        <a href="/planet"><img src="${pageContext.request.contextPath}/img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <jsp:include page="login_form.jsp" />
    <div style="clear: both"></div>
    <div class="hidden-passrecovery">
	<div id="reg-form" class="registration">
		<div>
			<p>${Text['HEADER_REGISTER']}</p>
			<hr />
		</div>
		<div id="reg_error"></div>
		<form  method="post"
			onsubmit="return check_register_form()">
			<span>${Text['HEADER_ENTEREMAIL']}</span><br /> <input type="email"
				name="reg-email" required /><br /> <span>${Text['HEADER_ENTERPASS']}</span><br />
			<input id="password" type="password" name="password" required /><br />
			<span>${Text["HEADER_REPEATPASS"]}</span><br /> <input id="password2"
				type="password" name="password" required /><br />
			<div>
				<input type="submit" class="log-reg-buttons" id="reg-btn"
					value="${Text['HEADER_REGISTER']}">
			</div>
		</form>
	</div>
  </div>
	<div class="hidden-passrecovery">
        <form id="passrec-form" method="post" action="#">
            <span>${Text["HEADER_REMINDPASS"]}</span>
            <input type="email" name="email" placeholder="email" required/><br>
            <p>${Text["HEADER_REGMAILTOSEND"]}</p>
            <input type="submit" class="log-reg-buttons" id="passrec-btn" value="${Text['HEADER_SEND']}"/>
        </form>
    </div>

</div>
