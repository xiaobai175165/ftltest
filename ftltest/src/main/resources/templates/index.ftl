<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8"/>
    <title>index</title>
</head>
<body>
<h1 align="center">Hello:</h1>
<#list userlist as u>
    <p>${u.name}</p>
</#list>
</body>
</html>