<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>

<form method="post" action="LoginBean.jsp">
User Name:<input type="text" name="userName" /><br/>
Password:<input type="password" name="password" /><br/>
<input type="submit" value="Login" /><br/>
</form>
<form method="post" action="Register.jsp">
New User? Then<input type="submit" value ="Register" /> 
</form>

</body>
</html>