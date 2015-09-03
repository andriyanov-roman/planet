$(document).ready(function () {
    $(".login-popup").magnificPopup();
    $(".passrec-popup").magnificPopup();
    $(".reg-popup").magnificPopup();

    $(".count_element").on("click", (function () {
        ga("send", "event", "goal", "goal");
        yaCounterXXXXXXXX.reachGoal("goal");
        return true;
    }));
    $('#' + $("html").attr("lang")).attr('selected', 'selected');
});
function select_lang(s) {
    $("#select_input").attr('value', s);
    $("#lang_form").trigger('submit');
}
function check_register_form() {
    if ($('#password').val() !== $('#password2').val()) {
        $('#reg_error').text("Пароли не равны");
        clearInputPasswordField();
        return false;
    }
    if ($('#password').val().length < 8) {
        $('#reg_error').text("Пароль должен содержать не менее 8 символов");
        clearInputPasswordField();
        return false;
    }
    var pw = $('#password').val();
    var res = pw.split("");
    var result = true;
    $.each(res, function (i, val) {
        if (!/[A-Za-z0-9_]/.test(val)) {
            result = false
        }
    });
    if (!result) {
        $('#reg_error').text('Пароль может содержать "A-Z" ,"a-z" ,"0-9" или "_"');
        clearInputPasswordField();
        return false;
    }
}

function clearInputPasswordField() {
    $('#password').val("");
    $('#password2').val("");
}
$('.basketCliaker').click(function () {
    $(".all-content").load("/planet/post", {command: "AjaxPost_Basket"});
    window.history.pushState({path: "/planet/basket"}, '', "/planet/basket");
    return false
});


function addToBasket(element) {
    if (Cookies.get('Basket') == null) {
        var basket = [];
        Cookies.set('Basket', basket);
    }
    var basket = JSON.parse(Cookies.get('Basket'));
    var item = element.find("[name=goods_id]").val();
    var cost = element.parents('.good_item').find('.cost').text();
    var addGood = '{ "good_id": ' + item + ', "cost":' + cost + '}';
    addGoods = JSON.parse(addGood);
    basket.push(addGoods);
    Cookies.set('Basket', JSON.stringify(basket));
    $.post("/planet/post", {
        command: "AjaxPost_Basket_add",
        item: item,
        cost: cost
    }, function (responseText, status, XMLHttpRequest) {/*alert(responseText);*/
    });
}
$(".button-buy").click(function () {
    addToBasket($(this));
});
function Log_in() {
    $(".loginPostBlock").load("/planet/post", {
        command: "AjaxPost_Log_In",
        name: $("#loginform").find("[name=name]").val(),
        password: $("#loginform").find("[name=password]").
            val(),
        remember: $("#loginform").find("[name=remember]").val()
    });
    return false
};

function Log_out() {
    $(".loginPostBlock").load("/planet/post", {
        command: "AjaxPost_Log_Out",
        uri: window.location.pathname
    }, function (responseText, status, XMLHttpRequest) {
        if (XMLHttpRequest.getResponseHeader("body_cleaner") == "true") {
            $(".all-content").load("/planet/post", {command: "AjaxPost_Body_cleaner"});
            window.history.pushState({path: "/planet"}, '', "/planet");
        }
    });
    return false
};

function My_Cabinet() {
    $(".all-content").load("/planet/post", {command: "AjaxPost_My_Cabinet"});
    window.history.pushState({path: "/planet/MyCabinet"}, '', "/planet/MyCabinet");
    return false
}


