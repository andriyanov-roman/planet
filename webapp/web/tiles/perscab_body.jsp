<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="${pageContext.request.contextPath}/css/pers_cabinet.css" type="text/css" rel="stylesheet" />
<div class="content">
    <div class="left-sidebar">
        <div id="pers_cabinet1" class="pers_cabinet_btn" onclick="select_columns_cab(this.id)"><div class="vertical">Личные данные</div></div>
        <div id="pers_cabinet2" class="pers_cabinet_btn" onclick="select_columns_cab(this.id)"><div class="vertical">Мои заказы</div></div>
        <div id="pers_cabinet3" class="pers_cabinet_btn" onclick="select_columns_cab(this.id)"><div class="vertical">Редактировать личные <br />данные</div></div>
        <div id="pers_cabinet4" class="pers_cabinet_btn" onclick="select_columns_cab(this.id)"><div class="vertical">Изменить пароль</div></div>
        		<c:choose>
					<c:when test="${sessionScope.role=='admin'}">
						<div class="pers_cabinet_btn" onclick="window.location.href ='/planet/administration'">
									<form method="post" action="/planet/administration" class="hiddenButton">
										<input type="submit"/>
									</form>
							<div class="vertical">${Text['ADMINISTRATION']}</div>
						</div>
					</c:when>
				</c:choose>
        <div class="pers_cabinet_btn exit" onclick="$('#Log_out_form_cab').submit()">
       					 <form id="Log_out_form_cab" method="post" class="hiddenButton"><input type="hidden" name="command" value="Log_Out"/>
       					 <input type="submit"/>
       					 </form>      
       	 	<div class="vertical">${Text['LOG_OUT']}</div>
       	 </div>
    </div>
    <div class="pers_data">
		<c:choose>
			<c:when test="${cookie.currentSelect.value=='pers_cabinet2'}">
				<div class="title">
					<p>Мои заказы</p>
				</div>
			</c:when>
			<c:when test="${cookie.currentSelect.value=='pers_cabinet3'}">
				<div class="title">
					<p>Редактировать личные данные</p>
				</div>
			</c:when>
			<c:when test="${cookie.currentSelect.value=='pers_cabinet4'}">
				<div class="title">
					<p>Изменить пароль</p>
				</div>
			</c:when>
			<c:otherwise>
			<div class="title">
					<p>Личные данные</p>
				</div>
				<table class="table">
					<tr>
						<th class="left-column">Имя:</th>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Фамилия:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Электронная почта:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Skype:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Адресс доставки:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Дата регистрации на сайте:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
					<tr>
						<td class="left-column">Персональная скидка:</td>
						<td class="right-column">Тут будет инфа о пользователе...</td>
					</tr>
				</table>
			</c:otherwise>
		</c:choose>
	</div>
     <script>
     $(document).ready(function() {
    	$('#'+Cookies.get('currentSelect')).css("background","transparent -moz-linear-gradient(center bottom , #B95D04, #F67C06) repeat scroll 0% 0%");
     });
    </script>
</div>