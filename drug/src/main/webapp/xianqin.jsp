<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1 >用户详情页</h1>
		<table border="1" style=" height:400px;text-align: center; font-size: 20px">
		 	<tr >
				<td>用户编号</td>		 	
				<td>${user.uid }</td>		 	
		 	</tr>
		 	<tr>
				<td>用户名称</td>		 	
				<td>${user.uname }</td>		 	
		 	</tr>
		 	<tr>
				<td>用户类型</td>		 	
				<td>
				<c:if test="${user.status==1 }">供应商</c:if>
				<c:if test="${user.status==2 }">医院</c:if>
				</td>		 	
		 	</tr>
		 	<tr>
				<td>工商照片</td>		 
				<td><img src="tupian/${user.icbc }"></td>		 	
		 	</tr>
		 	<tr>
				<td>身份证照片</td>		 	
				<td><img src="tupian/${user.identity }"></td>		 	
		 	</tr>
		 	<tr>
				<td>企业邮箱</td>		 	
				<td>${user.email }</td>		 	
		 	</tr>
		 	<tr>
				<td>企业地址</td>		 	
				<td>${user.address }</td>		 	
		 	</tr>
		</table>
		<a href="javascript:history.back(-1)"><button type="button" value="返回" style="width: 10%">返回</button></a>
	
	
	
	</center>

</body>
</html>