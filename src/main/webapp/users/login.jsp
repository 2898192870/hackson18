<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>系统登录</title>

		
	</head>

	<body>
	<form action="<%=path %>/users/login" method="post">
	<table>
		<tr>
			<td>名称</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="text" name="pwd"/></td>
		</tr>
		
		
		
		<tr>
			<td>
				<input type="submit" value="提交"/>
			</td>
			<td>
				<input type="reset" value="重置"/>
			</td>
		</tr>
	</table>
</form>

											
	</body>
</html>
