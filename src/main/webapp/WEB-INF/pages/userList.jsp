<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table border="1px">
        <tr>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
