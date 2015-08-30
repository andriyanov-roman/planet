<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${sessionScope.LOG_STATUS=='true'}">
		<div class="login">
			<div class="loginform">
					<img src="${pageContext.request.contextPath}/img/user_icon1.png" alt="user">
			</div>
			<div class="loginform">
				<div class="customfield">
					<p>Hello, user : ${sessionScope.uname}</p>
				</div>
				<div class="customfield">
					<p>with password : ${sessionScope.password}</p>
				</div>
			</div>
		</div>
		<div class="buttonMenu">
			<ul>
			<c:choose>
				<c:when test="${sessionScope.role=='admin'}">
				<li>
					<form method="post" action="/planet/administration">
						<input type="submit" class="log-reg-buttons" value="Administration" />
					</form>
				</li>
				</c:when>
				</c:choose>
				<li>
					<form method="post" action="/planet/basket">
						<input type="submit" class="log-reg-buttons" value="Basket" />
					</form>
				</li>
				<li>
					<form method="post" action="/planet/MyCabinet">
						<input type="submit" class="log-reg-buttons" value="My Cabinet" />
					</form>
				</li>
				<li>
					<form method="post">
						<input type="hidden" name="command" value="Log_Out" /> <input
							type="submit" class="log-reg-buttons" value="Log Out" />
					</form>
				</li>
			</ul>
		</div>
	</c:when>
	<c:otherwise>
		<div class="login">
			<%--  Hello,
		        <a href="#login-form" class="login-popup"><img src="img/user_icon.png" alt="user icon" /><span>login to personal cabinet</span></a>
		        --%>
			<form method="post" class="loginform">
				<input type="hidden" name="command" value="Log_In" />
				<div class="field">
					<label for="log">${Text['HEADER_LOGIN']}</label> <input type="text" id="log"
						name="name" placeholder="${Text['PLACEHOLDER_NAME']}" required>
				</div>
				<div class="field">
					<label for="pass">${Text['HEADER_PASSWORD']}</label> <input type="password"
						id="pass" name="password" placeholder="${Text['PLACEHOLDER_PASS']}" required />
				</div>
				<a href="Registration">${Text['HEADER_REGISTER']}</a>
				<a href="#passrec-form" class="passrec-popup" id="forg-pass-link">${Text['HEADER_FORGOTPASS']}</a>
				<input type="submit" class="log-reg-buttons" id="login-btn"
					value="${Text['HEADER_BT_LOGIN']}" />
			</form>
			<%--<div>--%>
				<%--<div class="customfield">--%>
					<%--<a href="#passrec-form">${Text['HEADER_FORGOTPASS']}</a>--%>
				<%--</div>--%>
					<%--<div class="customfield">--%>
						<%--<a href="Registration">${Text['HEADER_REGISTER']}</a>--%>
					<%--</div>--%>
			<%--</div>--%>
			<%--<div class="buttonBasket">--%>
				<%--<ul>--%>
					<%--<li>--%>
						<%--<form method="post" action="/planet/basket">--%>
							<%--<input type="submit" class="log-reg-buttons" value="Basket" />--%>
						<%--</form>--%>
					<%--</li>--%>
				<%--</ul>--%>
			<%--</div>--%>
		</div>
	</c:otherwise>
</c:choose>