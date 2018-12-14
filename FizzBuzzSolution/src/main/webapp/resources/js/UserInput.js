/**
 * 
 */

function sendUserInput() {
	var numberList = document.getElementById("inputNumber").value;
	alert("jshdjs" + numberList);
	var name = numberList;
	$.ajax({
	     type: "POST",
	     url: "submit.htm",
	     data: { name: "John", location: "Boston" } // parameters
	})
}