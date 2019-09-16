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
		<h1 >药品详情页</h1>
		<table border="1" style=" height:500px;text-align: center; font-size: 20px">
		 	<tr >
				<td>药品编号</td>		 	
				<td>${d.didi }</td>		 	
		 	</tr>
		 	<tr>
				<td>药品名称</td>		 	
				<td>${d.dname }</td>		 	
		 	</tr>
		 	<tr>
				<td>主要成分</td>		 	
				<td>${d.bases }</td>		 	
		 	</tr>
		 	<tr>
				<td>功能主治</td>		 	
				<td>${d.function }</td>		 	
		 	</tr>
		 	<tr>
				<td>性状</td>		 
				<td>${d.character }</td>		 	
		 	</tr>
		 	<tr>
				<td>药品照片</td>		 	
				<td><img src="tupian/${d.photo }"></td>		 	
		 	</tr>
		 	<tr>
				<td>供货商地址</td>		 	
				<td>${u.address }</td>		 	
		 	</tr>
		 	<tr>
				<td>批准文号</td>		 	
				<td>${d.approvalnumber }</td>		 	
		 	</tr>
		</table>
		<a href="javascript:history.back(-1)"><button type="button" value="返回" style="width: 10%">返回</button></a>
	
	
	
	</center>

</body>
</html>