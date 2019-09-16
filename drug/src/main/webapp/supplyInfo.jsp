<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
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
    <script src="js/jquery-1.11.0.js" type="text/javascript" charset="utf-8"></script>
</head>

<body>
    <!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
            <!-- Mobile Menu end -->
        <div class="product-status mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-status-wrap drp-lst">
                            <h4>供应清单</h4>
                            <div class="asset-inner">
                                <table>
                                    <tr>
                                        <th>编号</th>
                                        <th>药品照片</th>
                                        <th>药品名称</th>
                                        <th>药品有效期至</th>
                                        <th>批准文号</th>
                                        <th>供应数量</th>
                                        <th>供应单价</th>
                                        <th>所属类别</th>
                                        <th>状态</th>
                                        <th>操作1</th>
                                        <th>操作2</th>
                                    </tr>
                                    <c:forEach items="${drugList }" var="d">
                                    <tr>
                                        <td>${d.id }</td>
                                        <td><img src="tupian/${d.photo }"></td>
                                        <td>${d.dname }</td>
                                        <td>${d.periodofvalidity }</td>
                                        <td>${d.approvalnumber }</td>
                                        <td>${d.amount }</td>
                                        <td>${d.price }</td>
                                        <td>
                                        ${d.min.minname }
                                        <c:if test="${d.min.typeid==1}">(中成药)</c:if>
                                        <c:if test="${d.min.typeid==2}">(西药)</c:if>
                                        </td>
                                        <td>
                                         <c:if test="${d.status==0}"><span style="color: red;">未通过</span></c:if>
                                         <c:if test="${d.status==1}"><span style="color: green;">已通过</span></c:if>
                                         <c:if test="${d.status==2}"><span style="color: green;">审核中</span></c:if>
                                        </td>
                                        <td><c:if test="${d.status!=0}"><a href="del.action?id1=${d.id }">取消供应</a></c:if>
                                         <c:if test="${d.status==0}"><a href="del.action?id1=${d.id }">删除</a></c:if>
                                        </td>
                                        <td><c:if test="${d.status!=0}"><a href="update.action?id1=${d.id }">修改数量</a></c:if></td>
                                    </tr>
                                    </c:forEach>
                                </table>
                            </div>
                            <div class="custom-pagination" style="text-align: center;">
                                <nav aria-label="Page navigation example">
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="p.action?pageIndex1=1">首页</a></li>
                                        <li class="page-item"><a class="page-link" href="p.action?pageIndex1=${pageIndex-1}">上一页</a></li>
                                        <li class="page-item"><span class="page-link"> 当前第${pageIndex}页，总共${pageCount}页</span></li>
                                        <li class="page-item"><a class="page-link" href="p.action?pageIndex1=${pageIndex+1}">下一页</a></li>
                                        <li class="page-item"><a class="page-link" href="p.action?pageIndex1=${pageCount}">末页</a></li>
                                        <li class="page-item">
                                        <form action="p.action" method="post">
                                        <div class="page-link">
                                                                                                       跳到<input type="text" name="pageIndex1" id="page">页&nbsp&nbsp<input type="submit" value="查询" id="su">
                                        </div>
                                        </form>
                                        </li>
                                    </ul>
                                </nav>
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
<script type="text/javascript">
$("#su").click(function(){
	var page=$("#page").val();
	if(page==''||page==null){
		return false;
	}
})
</script>