<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>

<div class="header">
    <div class="logo">
        <a href="/planet"><img src="${pageContext.request.contextPath}/img/shop-logo.png" alt="Shop-logo"></a>
    </div>
    <div class="login">
    	<div class="headerline loginPostBlock">
    		<jsp:include page="login_form.jsp" />
    	</div>
    	<div class="headerline">
						<div class="table-cell-block">
							<div class="basket basketCliaker">
								<a href="/planet/basket"><span class="basket-content">${Text['BASKET_EMPTY']}</span></a>
							</div>
						</div>
					</div>
    </div>
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
