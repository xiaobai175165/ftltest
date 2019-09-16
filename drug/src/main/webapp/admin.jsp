<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Dashboard V.1 | Kiaalap - Kiaalap Admin Template</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- favicon
		============================================ -->
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
<!-- Google Fonts
		============================================ -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900"
	rel="stylesheet">
<!-- Bootstrap CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="https://ajax.aspnetcdn.com/ajax/bootstrap/3.3.6/css/bootstrap.min.css">
<!-- Bootstrap CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.bootcss.com/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- owl.carousel CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/owl.theme.css">
<link rel="stylesheet" type="text/css" href="css/owl.transitions.css">
<!-- animate CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/animate.css">
<!-- normalize CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/normalize.css">
<!-- meanmenu icon CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/meanmenu.min.css">
<!-- main CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!-- educate icon CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="css/educate-custon-icon.css">
<!-- morrisjs CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/morrisjs/morris.css">
<!-- mCustomScrollbar CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="css/scrollbar/jquery.mCustomScrollbar.min.css">
<!-- metisMenu CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="css/metisMenu/metisMenu.min.css">
<link rel="stylesheet" type="text/css"
	href="css/metisMenu/metisMenu-vertical.css">
<!-- calendar CSS
		============================================ -->
<link rel="stylesheet" type="text/css"
	href="css/calendar/fullcalendar.min.css">
<link rel="stylesheet" type="text/css"
	href="css/calendar/fullcalendar.print.min.css">
<!-- style CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="style.css">
<!-- responsive CSS
		============================================ -->
<link rel="stylesheet" type="text/css" href="css/responsive.css">
<!-- modernizr JS
		============================================ -->
<script type="text/javascript" charset="utf-8"
	src="js/vendor/modernizr-2.8.3.min.js"></script>
<script src="jquery-1.11.0.js" type="text/javascript" charset="utf-8"></script>
</head>

<body>
	<!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
	<!-- Start Left menu area -->
	<div class="left-sidebar-pro">
		<nav id="sidebar" class="">
			<div class="sidebar-header">
				<a href="admin.jsp"><img src="img/timg.jpg" width="200px"></a></strong>
			</div>

			<div class="left-custom-menu-adp-wrap comment-scrollbar">
				<nav class="sidebar-nav left-sidebar-menu-pro">
					<ul class="metismenu" id="menu1">
						<br>
						<br>
						<li><a class="has-arrow" href="all-courses.html"
							aria-expanded="false"><span
								class="educate-icon educate-department icon-wrap"></span> <span
								class="mini-click-non">注册审核管理</span></a>
							<ul class="submenu-angle" aria-expanded="false">
								<li><a title="Departments List" href="checkedUser.action"
									target="f"><span class="mini-sub-pro">已审核用户</span></a></li>
								<li><a title="Add Departments" href="uncheckedUser.action"
									target="f"><span class="mini-sub-pro">待审核用户</span></a></li>
							</ul></li>
						<br>
						<li><a class="has-arrow" href="all-courses.html"
							aria-expanded="false"><span
								class="educate-icon educate-department icon-wrap"></span> <span
								class="mini-click-non">药品审核管理</span></a>
							<ul class="submenu-angle" aria-expanded="false">
								<li><a title="Departments List" href="checkedDrug.action"
									target="f"><span class="mini-sub-pro">已审核药品</span></a></li>
								<li><a title="Add Departments" href="uncheckedDrug.action"
									target="f"><span class="mini-sub-pro">待审核药品</span></a></li>
							</ul></li>
						<br>
						<li><a class="has-arrow" href="all-courses.html"
							aria-expanded="false"><span
								class="educate-icon educate-department icon-wrap"></span> <span
								class="mini-click-non">订单查询</span></a>
							<ul class="submenu-angle" aria-expanded="false">
								<li><a title="Departments List" href="todindanhao.action"
									target="f"><span class="mini-sub-pro">按订单号查</span></a></li>
								<li><a title="Add Departments" href="nian5.action"
									target="f"><span class="mini-sub-pro">按时间查</span></a></li>
							</ul></li>
						<br>
						<!-- <li id="removable">
                            <a class="has-arrow" href="#" aria-expanded="false"><span class="educate-icon educate-pages icon-wrap"></span> <span class="mini-click-non">网页</span></a>
                            <ul class="submenu-angle page-mini-nb-dp" aria-expanded="false">
                                <li><a title="Login" href="login.html" target="f"><span class="mini-sub-pro">登录</span></a></li>
                                <li><a title="Register" href="register.html" target="f"><span class="mini-sub-pro">寄存器</span></a></li>
                                <li><a title="Lock" href="lock.html" target="f"><span class="mini-sub-pro">锁</span></a></li>
                                <li><a title="Password Recovery" href="password-recovery.html" target="f"><span class="mini-sub-pro">找回密码</span></a></li>
                                <li><a title="404 Page" href="404.html" target="f"><span class="mini-sub-pro">404 页</span></a></li>
                                <li><a title="500 Page" href="500.html" target="f"><span class="mini-sub-pro">500 页</span></a></li>
                            </ul>
                        </li> -->
					</ul>
				</nav>
			</div>
		</nav>
	</div>
	<!-- End Left menu area -->
	<!-- Start Welcome area -->
	<div class="all-content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="logo-pro">
						<a href="index.html"><img class="main-logo"
							src="img/logo/logo.png" alt="" /></a>
					</div>
				</div>
			</div>
		</div>
		<div class="header-advance-area">
			<div class="header-top-area">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="header-top-wraper">
								<div class="row">
									<div class="col-lg-1 col-md-0 col-sm-1 col-xs-12">
										<div class="menu-switcher-pro">
											<button type="button" id="sidebarCollapse"
												class="btn bar-button-pro header-drl-controller-btn btn-info navbar-btn">
												<i class="educate-icon educate-nav"></i>
											</button>
										</div>
									</div>
									<div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
										<div class="header-top-menu tabl-d-n">
											<ul class="nav navbar-nav mai-top-nav">
												<li class="nav-item"><a href="#" class="nav-link"></a>
												</li>
												<li class="nav-item"><a href="#" class="nav-link"></a>
												</li>
												<li class="nav-item"><a href="#" class="nav-link"></a>
												</li>
												<li class="nav-item dropdown res-dis-nn"><a href="#"
													data-toggle="dropdown" role="button" aria-expanded="false"
													class="nav-link dropdown-toggle"><span
														class="angle-down-topmenu"></span></a>
													<div role="menu" class="dropdown-menu animated zoomIn">
														<a href="#" class="dropdown-item"></a> <a href="#"
															class="dropdown-item"></a> <a href="#"
															class="dropdown-item"></a> <a href="#"
															class="dropdown-item"></a>
													</div></li>
												<li class="nav-item"><a href="#" class="nav-link"></a>
												</li>
											</ul>
										</div>
									</div>
									<div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
										<div class="header-right-info">
											<ul class="nav navbar-nav mai-top-nav header-right-menu">
												<!--  <li class="nav-item dropdown">
                                                    <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle"><i class="educate-icon educate-message edu-chat-pro" aria-hidden="true"></i><span class="indicator-ms"></span></a>
                                                    <div role="menu" class="author-message-top dropdown-menu animated zoomIn">
                                                        <div class="message-single-top">
                                                            <h1>Message</h1>
                                                        </div>
                                                        <ul class="message-menu">
                                                            <li>
                                                                <a href="#">
                                                                    <div class="message-img">
                                                                        <img src="img/contact/1.jpg" alt="">
                                                                    </div>
                                                                    <div class="message-content">
                                                                        <span class="message-date">16 Sept</span>
                                                                        <h2>Advanda Cro</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="message-img">
                                                                        <img src="img/contact/4.jpg" alt="">
                                                                    </div>
                                                                    <div class="message-content">
                                                                        <span class="message-date">16 Sept</span>
                                                                        <h2>Sulaiman din</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="message-img">
                                                                        <img src="img/contact/3.jpg" alt="">
                                                                    </div>
                                                                    <div class="message-content">
                                                                        <span class="message-date">16 Sept</span>
                                                                        <h2>Victor Jara</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="message-img">
                                                                        <img src="img/contact/2.jpg" alt="">
                                                                    </div>
                                                                    <div class="message-content">
                                                                        <span class="message-date">16 Sept</span>
                                                                        <h2>Victor Jara</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                        </ul>
                                                        <div class="message-view">
                                                            <a href="#">View All Messages</a>
                                                        </div>
                                                    </div>
                                                </li> -->
												<!--      <li class="nav-item"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle"><i class="educate-icon educate-bell" aria-hidden="true"></i><span class="indicator-nt"></span></a>
                                                    <div role="menu" class="notification-author dropdown-menu animated zoomIn">
                                                        <div class="notification-single-top">
                                                            <h1>Notifications</h1>
                                                        </div>
                                                        <ul class="notification-menu">
                                                            <li>
                                                                <a href="#">
                                                                    <div class="notification-icon">
                                                                        <i class="educate-icon educate-checked edu-checked-pro admin-check-pro" aria-hidden="true"></i>
                                                                    </div>
                                                                    <div class="notification-content">
                                                                        <span class="notification-date">16 Sept</span>
                                                                        <h2>Advanda Cro</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="notification-icon">
                                                                        <i class="fa fa-cloud edu-cloud-computing-down" aria-hidden="true"></i>
                                                                    </div>
                                                                    <div class="notification-content">
                                                                        <span class="notification-date">16 Sept</span>
                                                                        <h2>Sulaiman din</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="notification-icon">
                                                                        <i class="fa fa-eraser edu-shield" aria-hidden="true"></i>
                                                                    </div>
                                                                    <div class="notification-content">
                                                                        <span class="notification-date">16 Sept</span>
                                                                        <h2>Victor Jara</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="#">
                                                                    <div class="notification-icon">
                                                                        <i class="fa fa-line-chart edu-analytics-arrow" aria-hidden="true"></i>
                                                                    </div>
                                                                    <div class="notification-content">
                                                                        <span class="notification-date">16 Sept</span>
                                                                        <h2>Victor Jara</h2>
                                                                        <p>Please done this project as soon possible.</p>
                                                                    </div>
                                                                </a>
                                                            </li>
                                                        </ul>
                                                        <div class="notification-view">
                                                            <a href="#">View All Notification</a>
                                                        </div>
                                                    </div>
                                                </li> -->
												<li class="nav-item"><a href="#" data-toggle="dropdown"
													role="button" aria-expanded="false"
													class="nav-link dropdown-toggle"> <img
														src="img/product/微信图片_20190823141905.jpg" alt="" /> <span
														class="admin-name">${users.uname}---管理员---</span> <i
														class="fa fa-angle-down edu-icon edu-down-arrow"></i>
												</a>
													<ul role="menu"
														class="dropdown-header-top author-log dropdown-menu animated zoomIn">
														<!-- <li><a href="#"><span class="edu-icon edu-home-admin author-log-ic"></span>我的账户</a>
                                                        </li>
                                                        <li><a href="#"><span class="edu-icon edu-user-rounded author-log-ic"></span>我的简历</a>
                                                        </li>
                                                        <li><a href="#"><span class="edu-icon edu-money author-log-ic"></span>用户结算</a>
                                                        </li> -->
													
														<li><a href="exit.action"><span
																class="edu-icon edu-locked author-log-ic"></span>退出</a></li>
													</ul></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<iframe src="welcome.jsp" width="100%" height="650px" name="f"
			style="border: none;"> </iframe>



		<div class="footer-copyright-area">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<div class="footer-copy-right">
							<p>
								Copyright © 2018 <a
									href="https://themeforest.net/user/soft_theme/portfolio">soft_theme</a>
								All rights reserved.
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- jquery
		============================================ -->
	<script
		src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-1.12.4.min.js"></script>
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
	<!-- counterup JS
		============================================ -->
	<script src="js/counterup/jquery.counterup.min.js"></script>
	<script src="js/counterup/waypoints.min.js"></script>
	<script src="js/counterup/counterup-active.js"></script>
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
	<script src="https://cdn.bootcss.com/raphael/2.1.0/raphael-min.js"></script>
	<script src="https://cdn.bootcss.com/morris.js/0.5.0/morris.js"></script>
	<script src="js/morrisjs/morris-active.js"></script>
	<!-- morrisjs JS
		============================================ -->
	<script src="js/sparkline/jquery.sparkline.min.js"></script>
	<script src="js/sparkline/jquery.charts-sparkline.js"></script>
	<script src="js/sparkline/sparkline-active.js"></script>
	<!-- calendar JS
		============================================ -->
	<script src="js/calendar/moment.min.js"></script>
	<script
		src="https://cdn.bootcss.com/fullcalendar/3.8.0/fullcalendar.min.js"></script>
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


<!-- Mirrored from jsofttheme.com/kiaalap-preview/kiaalap/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 30 May 2018 22:15:38 GMT -->
</html>