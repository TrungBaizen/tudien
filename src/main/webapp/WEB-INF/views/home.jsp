<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/12/2024
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Từ Điển</title>
</head>
<body>
<form action="home" method="post">
    <h1>Từ Điển</h1>
    <input type="text" name="word" placeholder="Nhập từ cần tìm">
    <button type="submit">Tìm kiếm</button>
</form>
<h1>Kết quả:</h1>
<p>${meaning}</p>
</body>
</html>