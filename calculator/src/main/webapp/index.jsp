<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<h2>Calculator</h2>
	<form method="get" action="calculator">
		Param1 : <input type="text" value="4" name="p1"> Param2 : <input type="text" value="2" name="p2"><br> 
		<input type="submit" name="process" value="+">
		<input type="submit" name="process" value="-">
		<input type="submit" name="process" value="*">
		<input type="submit" name="process" value="/">
	</form>
</body>
</html>
