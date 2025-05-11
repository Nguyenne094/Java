<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Trang chủ</h2>
    <p>Số lượt truy cập: <c:out value="${applicationScope.visitCount}" /></p>

    <c:if test="${applicationScope.visitCount > 10}">
        <p style="color:red;">Số lượt truy cập đã vượt quá 10!</p>
    </c:if>
</body>
</html>