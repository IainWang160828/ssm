<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Login</title>
</head>
<body>
欢迎您：${requestScope.resp.username}，用户权限：${requestScope.resp.userRoleDesc}
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr><th width="250">用户名</th><th width="250">用户ID</th><th  width="250">手机号</th><th width="250">邮箱</th><th width="250">公司</th><th width="250">年龄</th><c:if test="${(requestScope.resp.userRole=='A')}"><th width="250">权限修改</th></c:if></tr>
</thead>
<tbody>
<c:forEach items="${requestScope.resp.userList}" var="u"> 
<tr>
<td align="center">${u.username}</td>
<td align="center">${u.userId}</a></td>
<td align="center">${u.telephone}</a></td>
<td align="center">${u.email}</a></td>
<td align="center">${u.company}</a></td>
<td align="center">${u.age}</a></td>
<c:if test="${(requestScope.resp.userRole=='A')}"><td align="center"><a href="/RoleQuery">修改</a></td></c:if>
</tr>
</c:forEach>
</tbody>
</table>
<br/>
</body>
</html>