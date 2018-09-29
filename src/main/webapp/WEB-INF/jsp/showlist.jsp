<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>show user</title>
</head>
<body>
    <table border="1px">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
            <td>年龄</td>
        </tr>
        <c:forEach items="${userList }" var="user" varStatus="s">
            <tr align="center">
                <td>${s.count}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>