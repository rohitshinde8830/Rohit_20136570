<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>EMI CAl</h1>

<form action="calculate" method ="post">
<label for="principal">PRincipal Amt: </label>
<input type ="number" id="principal" name="principal" required"><br><br>

<label for="interest">interest rate %: </label>
<input type ="number" id="interest" name="interest" required"><br><br>

<label for="time">Time (months): </label>
<input type ="number" id="time" name="time" required"><br><br>

<input type="submit" value = "calculte">

</form>
</body>
</html>