<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Đăng nhập</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
		body {
			background-color: #fff;
			color: #000;
			font-family: 'Segoe UI', sans-serif;
			height: 100vh;
			display: flex;
			align-items: center;
			justify-content: center;
			animation: fadeIn 0.4s ease;
		}
		.login-box {
			width: 100%;
			max-width: 400px;
			padding: 30px;
			border: 1px solid #ddd;
			border-radius: 12px;
			box-shadow: 0 0 20px rgba(0,0,0,0.05);
			background-color: #fafafa;
		}
		.btn-custom {
			background-color: #000;
			color: #fff;
			transition: 0.3s;
		}
		.btn-custom:hover {
			background-color: #222;
			transform: scale(1.03);
		}
		@keyframes fadeIn {
			from { opacity: 0; transform: translateY(10px); }
			to { opacity: 1; transform: translateY(0); }
		}
	</style>
</head>
<body>
	<div class="login-box">
		<h4 class="text-center mb-4">Đăng nhập</h4>
		<form action="LoginServlet" method="post">
			<div class="mb-3">
				<label for="username" class="form-label">Tên đăng nhập</label>
				<input type="text" class="form-control" id="username" name="username" required>
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Mật khẩu</label>
				<input type="password" class="form-control" id="password" name="password" required>
			</div>
			<button type="submit" class="btn btn-custom w-100">Đăng nhập</button>
		</form>
	</div>
</body>
</html>
