<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="dindanhao.action" method="post">
	<table>
	<tr>
	<td>请输入订单号：</td>
	<td><input type="text" value="订单号" name="oid"></td>
	<td><input type="submit" value="查询"></td>
	</tr>
	</table>
	</form>
	<c:if test="${list!=null }">
		<table>
	<tr>
	
	<td>订单id</td>
	<td>商品</td>
	<td>总价</td>
	<td>购买时间</td>
	<td>收货时间</td>
	<td>收货状态</td>
		
	</tr>
	<tr>
	<td>${list.oid }</td>
	<td>${d.dname }</td>
	<td>${list.totalprice }</td>
	<td>${list.buytime }</td>
	<td>
	<c:if test="${list.takestatus!=1}">未收货</c:if>
	<c:if test="${list.takestatus==1}">${list.taketime }</c:if>
	</td>
	<td>	<c:if test="${list.takestatus==0}">未发货</c:if>
										<c:if test="${list.takestatus==1}">已发货</c:if>
										<c:if test="${list.takestatus==2}">已收货</c:if>
										<c:if test="${list.takestatus==3}">退货审</c:if>
										<c:if test="${list.takestatus==4}">已退货</c:if>
										</td>
	</tr>
	</table>
	</c:if>
	<h1 align="center">${mes }</h1>
</center>
</body>
</html>