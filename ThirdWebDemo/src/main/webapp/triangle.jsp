<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kiểm tra tam giác</title>
</head>
<body>
	<h2>Nhập độ dài 3 cạnh</h2>
	<form action="TriangleServlet" method="post">
		Cạnh a: <input type="text" name="a" required><br>
		Cạnh b: <input type="text" name="b" required><br>
		Cạnh c: <input type="text" name="c" required><br>
		<input type="submit" value="Kiểm tra">
	</form>
</body>
</html>
