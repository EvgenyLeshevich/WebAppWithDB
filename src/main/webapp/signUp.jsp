<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div align="center">
    <form method="post" action="/registration">
        <h1>Registration form:</h1>
        Name: <input name="name"/>
        <br><br>
        Last Name:<input name="lastName"/>
        <br><br>
        Login: <input name="login"/>
        <br><br>
        Password: <input name="password" type="password"/>
        <br><br>
        <input type="submit" value="Sign up"/>
    </form>
</div>
</body>
</html>
