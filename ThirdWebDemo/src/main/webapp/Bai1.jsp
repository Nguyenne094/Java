<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visit Counter</title>
</head>
<body>
	<h1>Visist Counter Application</h1>
	<div class="counter">
		<%
			Integer visitCount = (Integer) application.getAttribute("visitCount");
			if(visitCount == null)
				visitCount = 0;
			out.print("Total visit count: " + visitCount);
		%>
	</div>
	
	<form action="VisitCountServlet">
		<button type="submit">Refresh Count</button>
	</form>
</body>
</html>