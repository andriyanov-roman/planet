$(document).ready(function() {
	$(".login-popup").magnificPopup();
	$(".passrec-popup").magnificPopup();
	$(".reg-popup").magnificPopup();

	$(".count_element").on("click", (function() {
		ga("send", "event", "goal", "goal");
		yaCounterXXXXXXXX.reachGoal("goal");
		return true;
	}));
	$('#'+$("html").attr("lang")).attr('selected','selected');
});
function select_lang(s){
	$("#select_input").attr('value',s);
	$("#lang_form").trigger('submit');
}
function check_register_form(){
	if($('#password').val()!==$('#password2').val()){
		$('#reg_error').text("Пароли не равны");
		clearInputPasswordField();
		return false;
	}
	if($('#password').val().length<8){
		$('#reg_error').text("Пароль должен содержать не менее 8 символов");
		clearInputPasswordField();
		return false;
	}
	var pw =$('#password').val();
	var res = pw.split("");
	  var result = true;
	  $.each(res,function(i,val){
	  if(!/[A-Za-z0-9_]/.test(val)){
	  result=false	
	  	}	
	  });
	if (!result){
		$('#reg_error').text('Пароль может содержать "A-Z" ,"a-z" ,"0-9" или "_"');
		clearInputPasswordField();
		return false;
	}
}

function clearInputPasswordField(){
	$('#password').val("");
	$('#password2').val("");
}
$('.basketCliaker').click(function(){window.location.href='basket';});

function select_columns_cab(id){
	 Cookies.set('currentSelect', id);
	 window.location.href="";
};
