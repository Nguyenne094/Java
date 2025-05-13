<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kiểm tra tam giác</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet">
<style>
	body {
		background-color: #fff;
		color: #000;
		font-family: 'Segoe UI', sans-serif;
		animation: fadeInBody 0.5s ease;
	}
	.container-box {
		max-width: 500px;
		margin: 60px auto;
		padding: 30px;
		border: 1px solid #ddd;
		border-radius: 12px;
		box-shadow: 0 0 20px rgba(0,0,0,0.05);
		background-color: #fafafa;
		animation: scaleUp 0.4s ease;
		text-align: center;
	}
	.gif {
		width: 120px;
		margin-bottom: 20px;
		border-radius: 8px;
	}
	.title {
		font-weight: 600;
		margin-bottom: 20px;
	}
	.form-label {
		font-weight: 500;
	}
	.btn-custom {
		background-color: #000;
		color: #fff;
		border: none;
		transition: 0.3s ease;
	}
	.btn-custom:hover {
		background-color: #333;
		transform: scale(1.05);
	}
	.footer {
		text-align: center;
		font-size: 0.9em;
		margin-top: 20px;
		color: #777;
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
	<div class="container-box">
		<!-- GIF minh họa toán học -->
		<img src="https://media.giphy.com/media/RlwgAh75Owsswziqj9/giphy.gif" alt="Triangle Animation" class="gif">

		<h4 class="title"><i class="fas fa-ruler-triangle"></i> Kiểm tra tam giác</h4>

		<form action="TriangleServlet" method="post">
			<div class="mb-3 text-start">
				<label for="a" class="form-label">Cạnh a</label>
				<input type="text" class="form-control" id="a" name="a" required>
			</div>
			<div class="mb-3 text-start">
				<label for="b" class="form-label">Cạnh b</label>
				<input type="text" class="form-control" id="b" name="b" required>
			</div>
			<div class="mb-3 text-start">
				<label for="c" class="form-label">Cạnh c</label>
				<input type="text" class="form-control" id="c" name="c" required>
			</div>
			<button type="submit" class="btn btn-custom px-4 mt-2">Kiểm tra</button>
		</form>

		<div class="footer mt-4">
			<i class="fas fa-code"></i>
		</div>
	</div>
</body>
</html>
