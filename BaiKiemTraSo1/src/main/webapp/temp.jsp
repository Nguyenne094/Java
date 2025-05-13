<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chuyển đổi nhiệt độ</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .error { color: red; }
        .result { color: green; }
    </style>
</head>
<body>
    <h2>Chuyển đổi nhiệt độ</h2>
    <form action="convert" method="post">
        <label>Nhập nhiệt độ:</label>
        <input type="text" name="temperature" value="${param.temperature}"/>
        <br/><br/>
        <label>Loại chuyển đổi:</label>
        <select name="type">
            <option value="c2f" ${param.type == 'c2f' ? 'selected' : ''}>Celsius sang Fahrenheit</option>
            <option value="f2c" ${param.type == 'f2c' ? 'selected' : ''}>Fahrenheit sang Celsius</option>
        </select>
        <br/><br/>
        <input type="submit" value="Chuyển đổi"/>
    </form>

    <c:if test="${not empty error}">
        <p class="error"><c:out value="${error}"/></p>
    </c:if>
    <c:if test="${valid == true && not empty result}">
        <p class="result"><c:out value="${result}"/></p>
    </c:if>

    <p>Số lượng yêu cầu: <c:out value="${applicationScope.requestCount}"/></p>
</body>
</html>