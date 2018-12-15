<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Fizz Buzz Application</title>
<script
	src="${pageContext.request.contextPath}/resources/js/userInput.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="header">
		<h1>Fizz Buzz Puzzle</h1>
	</div>
	<div id="display" align="center">
		<br> <label>Enter Numbers : </label> 
		<input type="text" id="inputNumber" placeholder="Enter number"> 
		<a href="" onclick="alert('Please enter a integer or series of integer numbers seperates by comma (,) \n eg : 11 or 1,2,3')">Hint</a>
		<br><br>
		<input type="button" value="Submit" onclick="sendUserInput()"> <br> <br>
		<label id="output">Fizz Buzz Output</label>
		<table>
			<thead>
				<tr>
				</tr>
			</thead>
			<tbody id="tBody"></tbody>
		</table>
	</div>
</body>
</html>
