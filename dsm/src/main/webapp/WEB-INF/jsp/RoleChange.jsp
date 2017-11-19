<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>调整角色权限</title>
</head>
<body>
	<h3>修改用户权限</h3>
	<form action="roleChange" method="POST">

		<table cellspacing="0" border="1" class="table1">
			<thead>
				<tr>
					<th width="250">用户ID</th>
					<th width="250">用户名</th>
					<th width="250">用户原权限</th>
					<th width="250">用户新权限</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td align="center"><input type="text" name="userId" style="text-align:center" value=${requestScope.resp.userId}></td>
					<td align="center"><input type="text" name="userName" style="text-align:center" value=${requestScope.resp.userName}></td>
					<td align="center">${requestScope.resp.userRoleDesc}</td>
					<td align="center"><select name="userRole" id="userRole" >
							<option value="A">管理员</option>
							<option value="N">授权作者</option>
							<option value="R">读者</option>
					</select></td>
				</tr>
			</tbody>
			
		</table>
		<input type="submit" value="确定"/>
	</form>
	
</body>
</html>