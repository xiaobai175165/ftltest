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
</head>

<body>
    <!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
    <!-- Start Left menu area -->
    <!-- End Left menu area -->
    <!-- Start Welcome area -->
    <input type="hidden" name="index" value="1">
    
    <div  align="center" >
        <div class="product-status mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-status-wrap drp-lst">
                            <h2>采购订单列表</h2>
                           
                            <div class="asset-inner" style="height: 500px ">
                                <table >
                                    <tr>
                                        <th>订单号</th>
                                        <th>药品名称</th>
                                        <th>购买数量</th>
                                        <th>金额</th>
                                        <th>下单时间</th>
                                        <th>需求商</th>
                                        <th>操作</th>
                                    </tr>
                                    <c:forEach items="${olist}" var="o">
                                    <tr>
	<td>${o.oid }</td>
	
	<c:forEach items="${dlist }" var="d">
	<c:if test="${o.drugid==d.didi }"><td>${d.dname }</td></c:if>
	</c:forEach>
	
	<td>${o.count }</td>
	<td>${o.totalprice }</td>
	<td>${o.buytime }</td>
	
	<c:forEach items="${ulist }" var="u">
	<c:if test="${o.uid==u.uid}"><td>${u.uname }</td></c:if>
	</c:forEach>
	
	<td><a style="cursor: pointer;" class="fahuo" oid="${o.oid }" did="${o.drugid }" count="${o.count }">发货</a></td>
	</tr>
	</c:forEach>
	
                         </table>
                                
                        </div>
                        <div>
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="tolist.action?pageindex=1">首页</a></li>
                                        <li class="page-item"><a class="page-link" href="tolist.action?pageindex=${pageindex-1 }">上一页</a></li>
                                        <li class="page-item"><a class="page-link" href="#">${pageindex }</a></li>
                                        <li class="page-item"><a class="page-link" href="tolist.action?pageindex=${pageindex+1 }">下一页</a></li>
                                        <li class="page-item"><a class="page-link" href="tolist.action?pageindex=${count }">尾页</a></li>
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
 <script type="text/javascript" src="jquery-1.11.0.js"></script>
  <script type="text/javascript">
  $(function(){
	  var fabu=null;
	  $(".fahuo").click(function(){
		  var oid=$(this).attr("oid");
		  var count=$(this).attr("count");
		  var did=$(this).attr("did");
		 fabu=$(this);
		  $.post("fahuo.action",{"oid":oid,"count":count,"did":did},function(data){
			  if(data>0){
				  Popout("发货成功");
				  fabu.parent().parent().remove();
			  }else{
				  Popout("发货失败");
			  }
		  })
		  
	  })
		function Popout (str){
			$("body").append("<span id='tishi' style=' padding: 10px 20px; text-align: center;  background-color: blanchedalmond;  position: absolute;left: 50%;top: 50%;' >"+
			str+"</span>");
			setTimeout(function(){
				$("#tishi").remove();
			} ,3000);
		}
  })
  </script>