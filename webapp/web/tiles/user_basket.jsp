<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="UTF-8" %>
<link href="${pageContext.request.contextPath}/css/pers_cabinet.css" type="text/css" rel="stylesheet" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content">
    <form method="post">
        <div class = "basket_data">
        <div class="title">
            <p>${Text['MY_BASKET']}</p>
        </div>
        <table class="table">
            <tr>
                <th class="left-column">${Text["BASKET_NAME"]}</th>
                <th class="left-column">${Text["BASKET_DESK"]}</th>
                <th class="left-column">${Text["BASKET_Q_TY"]}</th>
                <th class="left-column">${Text["BASKET_PRICE"]}</th>
                <th class="left-column"></th>
            </tr>
      <c:forEach items="${sessionScope.Basket.basket}" var="basketItem" varStatus="loop">
     		 <tr class="BasketField">
            	<td class="left-column">${basketItem.id}</td>
                <td class="left-column">${Text["CAB_SECNAME"]}:</td>
                <td class="left-column"><input type="number" min="1" max="10000000" name="q_ty" placeholder="${basketItem.q_ty}"/></td>
                <td class="left-column">${basketItem.cost}</td>
                <td class="left-column">
                <span>
                <input type="hidden" name="deleteItem" value="${basketItem.id}"/>
                <input class="deleteButton" type="button" name="delete" value="Delete"/></span></td>
            </tr>
      </c:forEach>
        </table>
        </div>
        <div Style="text-align: center;"><input type="submit" class="log-reg-buttons" id="reg-btn" value="${Text['MAKE_ORDER']}"/></div>
    </form>
    <script type="text/javascript">
    $('.deleteButton').click(function(){
    var id = $(this).parent('span').find('[name=deleteItem]').attr('value');
    var index;
   	var basket = JSON.parse(Cookies.get('Basket'));
   	$.each(basket,function(i,val){
   		if(val.good_id==id){
   			index = i;
   			return false;
   		};
   	});
   	basket.splice (index, index);
   	Cookies.set('Basket', JSON.stringify(basket));
   	$.post("/planet/post",{command: "AjaxPost_Basket_delete",good_id: id});
    $(this).parents('.BasketField').remove();
    });
    </script>
</div>
