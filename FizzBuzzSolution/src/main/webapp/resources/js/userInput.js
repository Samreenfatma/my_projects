/**
 * js file resposible for sending data to the controller and display response to in view.
 */

function sendUserInput() {
	var numberList = document.getElementById("inputNumber").value;
	if(numberList == "") {
		alert("Please enter input");
		return;
	}
	var dataArrayToSend = [];
	var number = numberList.split(",");
	for (var i = 0; i < number.length; i++) {
		dataArrayToSend.push(number[i]);
	}
	$.ajax({
		type : "POST",
		url : "/FizzBuzzSolution/sendNumberList",
		data : JSON.stringify(dataArrayToSend),
		contentType : "application/json",
		success : function(response) {
			diaplayResponse(response);
			document.getElementById("inputNumber").value = "";
		},
		error : function(e) {
			alert('Error while sending data: ' + e);
		}
	});
}

function diaplayResponse(response) {
	var Table = document.getElementById('tBody');
	Table.innerHTML = "";
	var data = JSON.parse(response);
	var trHTML = '';
	for (i = 0; i < data.length; i++) {
		trHTML += '<td>' + data[i] + '</td>';
	}
	$('#tBody').append(trHTML);
}
