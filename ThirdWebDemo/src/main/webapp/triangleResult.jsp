<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kết quả</title>
</head>
<body>
	<h2>Kết quả:</h2>
	<p><%= request.getAttribute("result") %></p>
	<a href="triangle.jsp">Kiểm tra lại</a>
</body>
</html>
