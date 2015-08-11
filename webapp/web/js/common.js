$(document).ready(function() {

	$(".login-popup").magnificPopup();
	$(".reg-popup").magnificPopup();

	$(".count_element").on("click", (function() {
		ga("send", "event", "goal", "goal");
		yaCounterXXXXXXXX.reachGoal("goal");
		return true;
	}));
});