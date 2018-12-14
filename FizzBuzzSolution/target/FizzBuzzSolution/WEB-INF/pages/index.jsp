<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Fizz Buzz Application</title>
<script src="${pageContext.request.contextPath}/resources/js/UserInput.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.js"></script>
</head>
<body>
<h2>Please enter numbers</h2>
    <input type="text" name="enter" value="" id="inputNumber"/>
    <input type="button" value="submit" id="subBtn" onclick="sendUserInput()"/>
</body>
</html>
