<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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
</head>
<body>
    <input type="hidden" name="index" value="1">
    <input type="hidden" name="id" value="${id }">
    <div  align="center" >
        <div class="product-status mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-status-wrap drp-lst">
                            <h2>中药展示页面</h2>
                           
                            <div class="asset-inner"  style="height: 500px ">
                                <table>
                                    <tr>
                                        <th>药品名称</th>
                                        <th>药品拼音</th>
                                        <th>功能主治</th>
                                        <th>商品价格</th>
                                        <th>供应商</th>
                                        <th>操作</th>
                                    </tr>
                                    <c:forEach items="${pb.list}" var="o">
                                    <tr>
										<td>${o.dname }</td>
										
										
										<td>${o.pinyin }</td>
										<td>${o.function }</td>
										<td>${o.price }</td>
										<td>${o.users.address }</td>
	<td><a style="cursor: pointer;" href="xiangqing.action?id=${o.did }">详情</a></td>
	</tr>
	</c:forEach>
	
                         </table>
                               
                        </div>
                        <div>
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="zhongyao.action?pageindex=1&id=${id }">首页</a></li>
                                       <c:if test="${pb.currPage==1 }">
                                       <li class="page-item"><a class="page-link" href="javascript:void(0)">上一页</a></li>
                                       </c:if>
                                       <c:if test="${pb.currPage!=1 }">
                                       <li class="page-item"><a class="page-link" href="zhongyao.action?pageindex=${pb.currPage-1 }&id=${id }">上一页</a></li>
                                       </c:if>
                                        <li class="page-item"><a class="page-link" href="#">${pb.currPage }</a></li>
                                       <c:if test="${pb.currPage==pb.totalPage }">
                                       <li class="page-item"><a class="page-link" href="javascript:void(0)">下一页</a></li>
                                       </c:if>
                                       <c:if test="${pb.currPage!=pb.totalPage }">
                                       <li class="page-item"><a class="page-link" href="zhongyao.action?pageindex=${pb.currPage+1 }&id=${id }">下一页</a></li>
                                       </c:if>
                                        <li class="page-item"><a class="page-link" href="zhongyao.action?pageindex=${pb.totalPage }&id=${id }">尾页</a></li>
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
</html>