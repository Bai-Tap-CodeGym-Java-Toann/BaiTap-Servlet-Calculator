<%--
  Created by IntelliJ IDEA.
  User: FranKanal
  Date: 18/10/2018
  Time: 7:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SuperCal</title>
    <style>
        .input {
            margin: auto;
            border: black solid 2px;
            width: 500px;
            height: 150px;
            padding: 20px;
        }
    </style>
</head>
<body>
<form method="get" action="/reslut">
    <div style="padding-top: 30px">
        <div class="input">
            <h2> Nhập phép tính:</h2>
            <input type="text" size="50" name="cal" placeholder="nhập phép tính">
            <br>
            <br>
            <input type="submit" value="Tính" style="width: 80px; height: 30px">
        </div>
    </div>
</form>
</body>
</html>
