<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<style>
			div{
				width: 400px;
				height:300px ;
				background: #ccc;
			}
			div p{
				width: 300px;
				height: 30px;
				margin: 0 auto;
				margin-top: 20px;
			}
			div input{
				width: 200px;
				height: 30px;
			}
			div button{
				display: block;
				margin: 0 auto;
				margin-top: 20px;
				width: 100px;
				height: 30px;
			}
			
		</style>
	</head>
	<body >
	<center>

		<table border="1" width="70%"  >
			<tr >
				<th>选项 </th>
				<th>药品名称</th>
				<th>供货商</th>
				<th>数量</th>
				<th>单价</th>
				<th>小计</th>
				<th>操作</th>
			</tr>
			
			<c:forEach items="${allCartByDid }" var="cart">
			<tr >
				<td><input type="checkbox" checked="checked"  value="${cart.cid }" class="dianji" name="checkbox"/> </td>
				<td>${cart.drug.dname }</td>
				<input type="text" hidden="hidden" class="did" value="${cart.drugid}">
				<td>${cart.drug.users.uname }</td>
				<td>
					<span class="shulian">${cart.count }</span>
				</td>
				
				<td>
					${cart.drug.price }
				</td>
				<td id="zj">
					${cart.count*cart.drug.price }
					
				</td>
				<td>
					<a href="shanchu.action?cid=${cart.cid}"><input type="button" value="删除"  /></a>
				</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="6">
					<span>总价</span>
					<span id="zongjia">
					</span>
					
				</td>
				<td>
				<input class="zifu" type="button" value="支付">
				</td>
			</tr>
		</table>
	
		</center>
		
	</body>
	<script src="js/jquery-1.11.0.js"></script>
	<script type="text/javascript">
	$(function(){
		jisuanzongjia();
	})
	$(".dianji").click(function(){
		
		jisuanzongjia();
		
	});
	$(".qx").click(function(){
		
		$('input[name="checkbox"]').each(function(){
			$(this).prop("checked",true);
		});
		jisuanzongjia();
		
	});
	$(".fx").click(function(){
		
		$('input[name="checkbox"]').each(function(){
			if($(this).is(':checked')){
					$(this).prop("checked",false);
			}else{
					$(this).prop("checked",true);
			}

		});
		jisuanzongjia();
		
	});
	$(".qbx").click(function(){
		
		$('input[name="checkbox"]').each(function(){
			$(this).prop("checked",false);
		});
		jisuanzongjia();
		
	});
	$(".shanchu").click(function(){
		var cids="";
		$('input[name="checkbox"]:checked').each(function(){
			cids += $(this).val()+",";
		});
		location.href="shanchu1.action?cids="+cids;
	});
	$(".zifu").click(function(){
		var cids="";
		var dids="";
		var counts="";
		$('input[name="checkbox"]:checked').each(function(){
			cids += $(this).val()+",";
		});
		$(".did").each(function() {
			dids +=$(this).val()+",";
		})
		$(".shulian").each(function() {
			counts +=$(this).text()+",";
		})
		var zongjia=$("#zongjia").text();
		location.href="zifu.action?cids="+cids+"&dids="+dids+"&zongjia="+zongjia+"&counts="+counts;
	});
	function jisuanzongjia(){
		var zongjia=0;
		$('input[name="checkbox"]:checked').each(function(){
			var   jige=parseInt($(this).parent("td").siblings("#zj").text());
			zongjia+=jige;
		});
		$("#zongjia").html(zongjia);
	};
	
	</script>
</html>
