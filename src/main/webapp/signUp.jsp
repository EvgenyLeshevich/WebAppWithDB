<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration form:</h1>
Login: <input name="login"/>
<br><br>
Password: <input name="password" type="password"/>
<br><br>
Name: <input name="name"/>
<br><br>
Age: <input name="age" type="number" min=1/>
<br><br>
Email: <input name="email" type="email"/>
<br><br>
Gender: <input type="radio" name="gender" value="female"/>Female
<input type="radio" name="gender" value="male"/>Male
<br><br>
Country: <select name="country">
    <option>Belarus</option>
    <option>Russia</option>
    <option>USA</option>
    <option>Germany</option>
</select>
<br><br>
Courses:
<input type="checkbox" name="courses" value="Java" unchecked/>Java
<input type="checkbox" name="courses" value="C#" unchecked/>C#
<input type="checkbox" name="courses" value="Python" unchecked/>Python
<br><br>
<input type="submit" value="Add to database"/>
<form action="index.jsp">
    <input type="submit" value="Sign out"/>
</form>
</body>
</html>
