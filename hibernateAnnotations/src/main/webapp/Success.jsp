<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>successfully Registered</title>
</head>
<body>
<jsp:useBean id="ud"  class="hibernateAnnotations.RegisterBean" scope="session"></jsp:useBean>
<form method = "post" action="CarServlet">
Welcome <jsp:getProperty property="userName" name="ud"/>
Logged in Successfully.
Click here to check car inventory.
<input type = "submit" value = "cars">
</form>

</body>
</html>