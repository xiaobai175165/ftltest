<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
<html class="no-js" lang="en">

<!-- Mirrored from jsofttheme.com/kiaalap-preview/kiaalap/add-course.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 30 May 2018 22:16:21 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Add Course | Kiaalap - Kiaalap Admin Template</title>
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
    <!-- dropzone CSS
		============================================ -->
    <link rel="stylesheet" href="css/dropzone/dropzone.css">
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
    <!-- forms CSS
		============================================ -->
    <link rel="stylesheet" href="css/form/all-type-forms.css">
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
    <!-- Start Left menu area -->
    <!-- End Left menu area -->
    <!-- Start Welcome area -->
        <!-- Single pro tab review Start-->
        <div class="single-pro-review-area mt-t-30 mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-payment-inner-st">
                            <ul id="myTabedu1" class="tab-review-design">
                                <li class="active"><a href="#description">药品信息</a></li>
                            </ul>
                            <div id="myTabContent" class="tab-content custom-product-edit">
                                <div class="product-tab-list tab-pane fade active in" id="description">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="review-content-section">
                                                <div id="dropzone1" class="pro-ad addcoursepro">
                                                    <form action="doAddDrug.action" method="post" enctype="multipart/form-data" class="dropzone dropzone-custom needsclick addcourse" id="demo1-upload">
                                                        <div class="row">
                                                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                                 <div class="form-group">
                                                                    <input name="dname" id="dname1" type="text" class="form-control" placeholder="名称">
                                                                    <div id="dname2" style="display: none;color: red;">*药品名称不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="periodofvalidity" id="finish" type="text" class="form-control" placeholder="有效期至">
                                                                    <div id="finish1" style="display: none;color: red;">*药品有效期不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="pinyin" id="pinyin1" type="text" class="form-control" placeholder="汉语拼音">
                                                                    <div id="pinyin2" style="display: none;color: red;">*药品汉语拼音不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="bases" id="bases1" type="text" class="form-control" placeholder="主要成分">
                                                                    	<div id="bases2" style="display: none;color: red;">*药品主要成分不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="specification" id="s1" type="text" class="form-control" placeholder="规格">
                                                                    	<div id="s2" style="display: none;color: red;">*药品规格不能为空</div>
                                                                </div>
                                                                 <div class="form-group">
                                                                    <input name="character" id="c1" type="text" class="form-control" placeholder="性状">
                                                                    	<div id="c2" style="display: none;color: red;">*药品性状不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="userlevel" id="u1" type="text" class="form-control" placeholder="用法用量">
                                                                    	<div id="u2" style="display: none;color: red;">*药品用法用量不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="amount" id="a1" type="text" class="form-control" placeholder="供应数目">
                                                                    	<div id="a2" style="display: none;color: red;">*药品供应数目不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="price" id="p1" type="text" class="form-control" placeholder="供应单价">
                                                                    	<div id="p2" style="display: none;color: red;">*药品供应价格不能为空</div>
                                                                </div>
                                                                <div class="form-group res-mg-t-15">
                                                                    <input name="untowardeffect" id="un1" type="text" class="form-control" placeholder="不良反应">
                                                                    	<div id="un2" style="display: none;color: red;">*药品不良反应不能为空</div>
                                                                </div>
                                                                 <div class="form-group">
                                                                    <input name="approvalnumber" id="app1" type="text" class="form-control" placeholder="批准文号">
                                                                    	<div id="app2" style="display: none;color: red;">*药品批准文号不能为空</div>
                                                                </div>
                                                            </div>
                                                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                            	<div class="form-group">
                                                                     <input name="pic" class="form-control" type="file" id="pic1"/>
                                                                     <div id="pic2" style="display: none;color: red;">*药品图片不能为空</div>
                                                                </div>
                                                                 <div class="form-group" >
                                                                    <select name="typeid" class="form-control">
                                                                    <c:forEach var="l" items="${list }">
                                                                	<option value="${l.minid }">
                                                                	${l.minname}
                                                                	<c:if test="${l.typeid==1}">(中成药)</c:if>
                                                                	<c:if test="${l.typeid==2}">(西药)</c:if>
                                                                	</option>
                                                                	</c:forEach>
                                                                    </select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <textarea name="function" id="f1" placeholder="功能主治"></textarea>
                                                                    <div id="f2" style="display: none;color: red;">*药品功能主治说明不能为空</div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <textarea name="announcements" id="asd1" placeholder="注意事项"></textarea>
                                                                    <div id="asd2" style="display: none;color: red;">*药品注意事项不能为空</div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-lg-12">
                                                                <div class="payment-adress">
                                                                    <button type="submit" class="btn btn-primary waves-effect waves-light" id="sub">提交</button>
                                                                    <button type="reset" class="btn btn-primary waves-effect waves-light">重置</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                </div>
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
    <!-- maskedinput JS
		============================================ -->
    <script src="js/jquery.maskedinput.min.js"></script>
    <script src="js/masking-active.js"></script>
    <!-- datepicker JS
		============================================ -->
    <script src="js/datepicker/jquery-ui.min.js"></script>
    <script src="js/datepicker/datepicker-active.js"></script>
    <!-- form validate JS
		============================================ -->
    <script src="js/form-validation/jquery.form.min.js"></script>
    <script src="js/form-validation/jquery.validate.min.js"></script>
    <script src="js/form-validation/form-active.js"></script>
    <!-- dropzone JS
		============================================ -->
    <!-- tab JS
		============================================ -->
    <script src="js/tab.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="js/main.js"></script>
    <!-- tawk chat JS
		============================================ -->
    
</body>
<!-- Mirrored from jsofttheme.com/kiaalap-preview/kiaalap/add-course.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 30 May 2018 22:16:21 GMT -->
</html>
<script type="text/javascript">
    	$("#dname1").blur(function(){
    		var dname=$("#dname1").val();
    		if(dname==null||dname==''){
    			$("#dname2").css("display","block");
    		}else{
    			$("#dname2").css("display","none");
    		}
    	})
    	$("#finish").blur(function(){
    		var finish=$("#finish").val();
    		if(finish==null||finish==''){
    			$("#finish1").css("display","block");
    		}else{
    			$("#finish1").css("display","none");
    		}
    	})
    	$("#pinyin1").blur(function(){
    		var pinyin=$("#pinyin1").val();
    		if(pinyin==null||pinyin==''){
    			$("#pinyin2").css("display","block");
    		}else{
    			$("#pinyin2").css("display","none");
    		}
    	})
    	$("#bases1").blur(function(){
    		var bases=$("#bases1").val();
    		if(bases==null||bases==''){
    			$("#bases2").css("display","block");
    		}else{
    			$("#bases2").css("display","none");
    		}
    	})
    	$("#s1").blur(function(){
    		var s=$("#s1").val();
    		if(s==null||s==''){
    			$("#s2").css("display","block");
    		}else{
    			$("#s2").css("display","none");
    		}
    	})
    	$("#c1").blur(function(){
    		var c=$("#c1").val();
    		if(c==null||c==''){
    			$("#c2").css("display","block");
    		}else{
    			$("#c2").css("display","none");
    		}
    	})
    	$("#u1").blur(function(){
    		var u=$("#u1").val();
    		if(u==null||u==''){
    			$("#u2").css("display","block");
    		}else{
    			$("#u2").css("display","none");
    		}
    	})
    	$("#a1").blur(function(){
    		var a=$("#a1").val();
    		if(a==null||a==''){
    			$("#a2").css("display","block");
    		}else{
    			$("#a2").css("display","none");
    		}
    	})
    	$("#p1").blur(function(){
    		var p=$("#p1").val();
    		if(p==null||p==''){
    			$("#p2").css("display","block");
    		}else{
    			$("#p2").css("display","none");
    		}
    	})
    	$("#un1").blur(function(){
    		var un=$("#un1").val();
    		if(un==null||un==''){
    			$("#un2").css("display","block");
    		}else{
    			$("#un2").css("display","none");
    		}
    	})
    	$("#app1").blur(function(){
    		var app=$("#app1").val();
    		if(app==null||app==''){
    			$("#app2").css("display","block");
    		}else{
    			$("#app2").css("display","none");
    		}
    	})
    	$("#pic1").blur(function(){
    		var pic=$("#pic1").val();
    		if(pic==null||pic==''){
    			$("#pic2").css("display","block");
    		}else{
    			$("#pic2").css("display","none");
    		}
    	})
    	$("#f1").blur(function(){
    		var f=$("#f1").val();
    		if(f==null||f==''){
    			$("#f2").css("display","block");
    		}else{
    			$("#f2").css("display","none");
    		}
    	})
    	$("#asd1").blur(function(){
    		var asd=$("#asd1").val();
    		if(asd==null||asd==''){
    			$("#asd2").css("display","block");
    		}else{
    			$("#asd2").css("display","none");
    		}
    	})
    	$("#sub").click(function(){
    		var dname=$("#dname1").val();
    		var finish=$("#finish").val();
    		var pinyin=$("#pinyin1").val();
    		var bases=$("#bases1").val();
    		var s=$("#s1").val();
    		var c=$("#c1").val();
    		var u=$("#u1").val();
    		var a=$("#a1").val();
    		var p=$("#p1").val();
    		var un=$("#un1").val();
    		var app=$("#app1").val();
    		var pic=$("#pic1").val();
    		var f=$("#f1").val();
    		var asd=$("#asd1").val();
    		if(dname==null||dname==''||finish==null||finish==''||pinyin==null||pinyin==''||bases==null||bases==''||s==null||s==''||c==null||c==''||u==null||u==''||a==null||a==''||p==null||p==''||un==null||un==''||app==null||app==''||pic==null||pic==''||f==null||f==''||asd==null||asd==''){
    			return false;
    		}
    	})
    </script>