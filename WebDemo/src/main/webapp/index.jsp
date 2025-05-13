<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giải phương trình bậc 2</title>
</head>
<body>
	<h2>Giải phương trình ax² + bx + c = 0</h2>
	<form action="QuadraticServlet" method="post">
		A: <input type="text" name="a" required><br>
		B: <input type="text" name="b" required><br>
		C: <input type="text" name="c" required><br>
		<input type="submit" value="Giải">
	</form>
</body>
</html>