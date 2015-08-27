$(document).ready(function() {

	$(".login-popup").magnificPopup();
	$(".reg-popup").magnificPopup();
	$(".passrec-popup").magnificPopup();

	$(".count_element").on("click", (function() {
		ga("send", "event", "goal", "goal");
		yaCounterXXXXXXXX.reachGoal("goal");
		return true;
	}));
	$('#'+$("html").attr("lang")).attr('selected','selected');
});
function select(s){
	$("#select_input").attr('value',s);
	$("#lang_form").trigger('submit');
}