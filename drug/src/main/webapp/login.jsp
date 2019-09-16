<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>登录页</title>
  <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
  <meta name="author" content="Vincent Garreau" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <link rel="stylesheet" media="screen" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/reset.css"/>
</head>
<body style="background-image: url('img/bg.jpg'); " >

<div id="particles-js">
<h1 style="color: green;" align="center">${zc}</h1>
		<div class="login">
			<h2 style="color: red;" align="center">${cuowu}</h2>
			
			<div class="login-top">
				登录<a href="register.jsp" id="lg1">点击注册</a>
			</div>
			<form action="login.action" id="lg" method="post">
			<div class="login-center clearfix">
				<div class="login-center-img"><img src="img/name.png"/></div>
				<div class="login-center-input">
					<input type="text" name="uname" value="" placeholder="请输入您的用户名或邮箱" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
					<div class="login-center-input-text">用户名</div>
				</div>
			</div>
			<div class="login-center clearfix">
				<div class="login-center-img"><img src="img/password.png"/></div>
				<div class="login-center-input">
					<input type="password" name="password"value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
					<div class="login-center-input-text">密码</div>
				</div>
			</div>
			<div class="login-button">
				登录
			</div>
			</form>
		</div>
		<div class="sk-rotating-plane"></div>
</div>
<script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
<script type="text/javascript">
	$(function(){
		if ( top.location != self.location ){
			top.location =self.location;
		}
		$(".login-button").click(function(){
			$("#lg").submit();
		})
	})
</script>
<!-- scripts -->

</body>
</html>