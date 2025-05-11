<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String result = (String) request.getAttribute("result");
	boolean isTriangle = result != null && result.contains("tam giác");
	String gifUrl = isTriangle
		? "https://media.giphy.com/media/111ebonMs90YLu/giphy.gif"   // ✅ GIF check
		: "https://media.giphy.com/media/3og0IPxMM0erATueVW/giphy.gif"; // ❌ GIF cross
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kết quả</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	body {
		background-color: #ffffff;
		color: #000000;
		font-family: 'Segoe UI', sans-serif;
		animation: fadeInBody 0.6s ease;
	}
	.result-container {
		max-width: 400px;
		margin: 100px auto;
		padding: 30px;
		border: 1px solid #ddd;
		border-radius: 12px;
		box-shadow: 0 0 10px rgba(0,0,0,0.05);
		text-align: center;
		animation: scaleUp 0.5s ease;
	}
	.btn-custom {
		background-color: #000;
		color: #fff;
		border: none;
		text-decoration: none;
		padding: 8px 20px;
		border-radius: 6px;
		display: inline-block;
		transition: all 0.3s ease;
	}
	.btn-custom:hover {
		background-color: #333;
		transform: scale(1.05);
	}
	img {
		width: 120px;
		margin: 20px 0;
		border-radius: 12px;
	}

	@keyframes fadeInBody {
		from { opacity: 0; }
		to { opacity: 1; }
	}
	@keyframes scaleUp {
		from {
			transform: scale(0.95);
			opacity: 0;
		}
		to {
			transform: scale(1);
			opacity: 1;
		}
	}
</style>
</head>
<body>
	<div class="result-container">
		<h4>Kết quả</h4>
		<img src="<%= gifUrl %>" alt="GIF kết quả">
		<p class="my-4"><%= result %></p>
		<a href="triangle.jsp" class="btn-custom">Kiểm tra lại</a>
	</div>
</body>
</html>
