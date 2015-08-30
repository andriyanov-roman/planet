<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<link href="${pageContext.request.contextPath}/css/pers_cabinet.css" type="text/css" rel="stylesheet" />
<div class="content">
    <div class="left-sidebar">
        <a id="pers_cabinet1" onclick='select(this.id)'><div  class="pers_cabinet_btn" onclick='select(this.id)'><div class="vertical">Личные данные</div></div></a>
        <a><div id="pers_cabinet2" class="pers_cabinet_btn" onclick='select(this.id)'><div class="vertical">Мои заказы</div></div></a>
        <a><div id="pers_cabinet3" class="pers_cabinet_btn" onclick='select(this.id)'><div class="vertical">Редактировать личные <br />данные</div></div></a>
        <a><div id="pers_cabinet4"class="pers_cabinet_btn" onclick='select(this.id)'><div class="vertical">Изменить пароль</div></div></a>
        <a><div class="pers_cabinet_btn exit"><div class="vertical">Выход</div></div></a>
    </div>
    <div class="pers_data">
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
    </div>
</div>