<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en">


<!-- Mirrored from jsofttheme.com/kiaalap-preview/kiaalap/departments.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 30 May 2018 22:16:37 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Departments | Kiaalap - Kiaalap Admin Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/bootstrap/3.3.6/css/bootstrap.min.css">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- owl.carousel CSS
		============================================ -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/owl.theme.css">
    <link rel="stylesheet" href="css/owl.transitions.css">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="css/animate.css">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="css/normalize.css">
    <!-- meanmenu icon CSS
		============================================ -->
    <link rel="stylesheet" href="css/meanmenu.min.css">
    <!-- main CSS
		============================================ -->
    <link rel="stylesheet" href="css/main.css">
    <!-- educate icon CSS
		============================================ -->
    <link rel="stylesheet" href="css/educate-custon-icon.css">
    <!-- morrisjs CSS
		============================================ -->
    <link rel="stylesheet" href="css/morrisjs/morris.css">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- metisMenu CSS
		============================================ -->
    <link rel="stylesheet" href="css/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" href="css/metisMenu/metisMenu-vertical.css">
    <!-- calendar CSS
		============================================ -->
    <link rel="stylesheet" href="css/calendar/fullcalendar.min.css">
    <link rel="stylesheet" href="css/calendar/fullcalendar.print.min.css">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="style.css">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
    <script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
	<script type="text/javascript">
		$(function(){
			$("[name=sizes]").change(function(){
				$(".from").submit();
			});
			
			$(".delete").click(function(){
				var uid=$(this).attr("uid");
				if (window.confirm("确定要删除吗？")) {
					location.href="deleteUser.action?uid="+uid;
				}
			});
				
			
		})
	 </script>   
    
</head>

<body>
    <!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
    <!-- Start Left menu area -->
    <!-- End Left menu area -->
    <!-- Start Welcome area -->
    <input type="hidden" name="index" value="1">
    
    <div  align="center">
        <div class="product-status mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-status-wrap drp-lst">
                            <h2>已审核用户</h2>
                           
                            <div class="asset-inner">
                                <table>
                                    <tr>
                                        <th>用户编号</th>
                                        <th>用户名称</th>
                                        <th>用户密码</th>
                                        <th>用户类型</th>
                                     
                                        <th>企业邮箱</th>
                                        <th>企业地址</th>
                                        <th>用户状态</th>
                                        <th>操作</th>
                                    </tr>
                                    <c:forEach items="${us}" var="list">
                                    <tr>
                                        <td>${list.uid}</td>
                                        <td>${list.uname}</td>
                                        <td>${list.password}</td>
                                        <td>
                                        <c:if test="${list.status==0}">管理员</c:if>
                                        <c:if test="${list.status==1}">供应商</c:if>
                                        <c:if test="${list.status==2}">医院</c:if>
                                        </td>
                                       
                                        <td>${list.email}</td>
                                        <td>${list.address}</td>
                                        <td>
                                        <c:if test="${list.statuss==1}"> <button class="pd-setting">已通过</button></c:if>
                                        <c:if test="${list.statuss==0}"> <button class="pd-setting">未通过</button></c:if>
                                        </td>
                                        <td>
                                          <a class="xianqin"  href="xianqin.action?uid=${list.uid}"><button data-toggle="tooltip" title="Trash" class="pd-setting-ed">详情</button></a>
                                            <a class="delete" href="javascript:void(0);"  uid ="${list.uid}"><button data-toggle="tooltip" title="Trash" class="pd-setting-ed">删除</button></a>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    </table>
                             </div>
                              <hr>
   								 <div>
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="checkedUser.action?pageindex=1">首页</a></li>
                                        <li class="page-item"><a class="page-link" href="checkedUser.action?pageindex=${pageindex-1 }">上一页</a></li>
                                        <li class="page-item"><a class="page-link" href="#">${pageindex }/${count }</a></li>
                                        <li class="page-item"><a class="page-link" href="checkedUser.action?pageindex=${pageindex+1 }">下一页</a></li>
                                        <li class="page-item"><a class="page-link" href="checkedUser.action?pageindex=${count }">尾页</a></li>
                                    </ul>
                                </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </div>

    <!-- jquery
		============================================ -->
    <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
    <script src="js/jquery-price-slider.js"></script>
    <!-- meanmenu JS
		============================================ -->
    <script src="js/jquery.meanmenu.js"></script>
    <!-- owl.carousel JS
		============================================ -->
    <script src="js/owl.carousel.min.js"></script>
    <!-- sticky JS
		============================================ -->
    <script src="js/jquery.sticky.js"></script>
    <!-- scrollUp JS
		============================================ -->
    <script src="js/jquery.scrollUp.min.js"></script>
    <!-- mCustomScrollbar JS
		============================================ -->
    <script src="js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/scrollbar/mCustomScrollbar-active.js"></script>
    <!-- metisMenu JS
		============================================ -->
    <script src="js/metisMenu/metisMenu.min.js"></script>
    <script src="js/metisMenu/metisMenu-active.js"></script>
    <!-- morrisjs JS
		============================================ -->
    <script src="js/sparkline/jquery.sparkline.min.js"></script>
    <script src="js/sparkline/jquery.charts-sparkline.js"></script>
    <!-- calendar JS
		============================================ -->
    <script src="js/calendar/moment.min.js"></script>
    <script src="https://cdn.bootcss.com/fullcalendar/3.8.0/fullcalendar.min.js"></script>
    <script src="js/calendar/fullcalendar-active.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="js/main.js"></script>
    <!-- tawk chat JS
		============================================ -->
    
</body>


<!-- Mirrored from jsofttheme.com/kiaalap-preview/kiaalap/departments.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 30 May 2018 22:16:37 GMT -->
</html>