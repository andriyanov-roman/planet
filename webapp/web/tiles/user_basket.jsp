<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<link href="${pageContext.request.contextPath}/css/pers_cabinet.css" type="text/css" rel="stylesheet" />
<div class="content">
    <form method="post">
        <div class = "basket_data">
        <div class="title">
            <p>${Text['MY_BASKET']}</p>
        </div>
        <table class="table">
            <tr>
                <th class="left-column"><h1>№</h1></th>
                <th class="left-column">${Text["BASKET_NAME"]}</th>
                <th class="left-column">${Text["BASKET_DESK"]}</th>
                <th class="left-column">${Text["BASKET_Q_TY"]}</th>
                <th class="left-column">${Text["BASKET_PRICE"]}</th>
            </tr>
            <tr>
            	<td class="left-column">${Text["CAB_SECNAME"]}:</td>
            	<td class="left-column">${Text["CAB_SECNAME"]}:</td>
                <td class="left-column">${Text["CAB_SECNAME"]}:</td>
                <td class="left-column">${Text["CAB_SECNAME"]}:</td>
                <td class="left-column">${Text["CAB_SECNAME"]}:</td>
        </table>
        </div>
        <div Style="text-align: center;"><input type="submit" class="log-reg-buttons" id="reg-btn" value="${Text['MAKE_ORDER']}"/></div>
    </form>
</div>
