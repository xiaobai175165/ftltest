<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="doExcel.action" method="post" enctype="multipart/form-data">
请选择要上传的Excel表格：
<input type="file" name="excel"> 
<input type="submit" value="确认提交">
</form>
</body>
</html>