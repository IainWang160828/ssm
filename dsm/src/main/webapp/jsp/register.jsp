<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Test</title>
<base href="<%=basePath%>">
</head>
<body>
<form action="dsm/register" method="post">
<label>UseName:</label><input type="text" name="username"/></br>
<label>Password:</label><input type="text" name="password"/></br>
<label>Telephone:</label><input type="text" name="telephone"/></br>
<label>Company:</label><input type="text" name="company"/></br>
<label>Email:</label><input type="text" name="email"/></br>
<label>Age:</label><input type="text" name="age"/></br>
 <input type="submit" value="Submit"></input>
</form>
</body>
</html>