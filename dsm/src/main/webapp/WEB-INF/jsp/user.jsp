<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Test</title>
<base href="<%=basePath%>">
</head>
<body>
<form action="dsm/login" method="post">
<label>UseName:</label><input type="text" name="username"/></br>
<label>Password:</label><input type="text" name="password"/></br>
<input type="submit" value="Submit"></input><a href="jsp/register.jsp">没有账号？点此注册</a>
</form>
</body>
</html>