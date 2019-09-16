<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>表格合并</title>
	<link rel="stylesheet" href="css/base.css" type="text/css" />
</head>
<body>
<input type="hidden" id="add" value="${drug.did }">
<div class="c-main ptb20">
    <h3 class="mt30 mb10">药品详情:</h3>
    <table id="process-demo-1" class="tb tb-b c-100 c-t-center">
        <thead>
        <tr>
            <th>药品名称</th>
            <th>${drug.dname }</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>药品图片</th>
            <th><img alt="" src="tupian/${drug.photo }" width="400" height="400"></th>
        </tr>
        <tr>
            <td>药品拼音</td>
            <td>${drug.pinyin }</td>
        </tr>
        <tr>
            <td>主要成分</td>
            <td>${drug.bases }</td>
        </tr>
        <tr>
            <td>药品性状</td>
            <td>${drug.character }</td>
        </tr>
        <tr>
            <td>功能主治</td>
            <td>${drug.function }</td>
        </tr>
        <tr>
            <td>用法用量</td>
            <td>${drug.userlevel }</td>
        </tr>
        <tr>
            <td>不良反应</td>
            <td>${drug.untowardeffect }</td>
        </tr>
        <tr>
            <td>注意事项</td>
            <td>${drug.announcements }</td>
        </tr>
        <tr>
            <td>规格</td>
            <td>${drug.specification }</td>
        </tr>
        <tr>
            <td>有效期</td>
            <td>${drug.periodofvalidity }</td>
        </tr>
        <tr>
            <td>批准文号</td>
            <td>${drug.approvalnumber }</td>
        </tr>
        <tr>
            <td>供应价格</td>
            <td>${drug.price}元</td>
        </tr>
        <tr>
            <td>将此药品添加至购物车</td>
            <td><input type="text" id="count" name="count" placeholder="请输入您要购买的数量" onfocus="this.placeholder=''"><input type="button" value="提交" id="addgouwuche"></td>
        </tr>
        </tbody>
    </table>
    
</div>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/tablesMergeCell.js"></script>

<script type="text/javascript">
$("#addgouwuche").click(function(){
	var e=$("#add").val();
	
	var s=$("#count").val();
	
	$.post("addgouwuche.action?drugid="+e,{"count":s},function(data){
		if(data==1){
			alert("已添加至购物车!");
		}
	})
})

</script>
</body>
</html>