<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jQuery用户注册表单验证代码</title>
<link href="css/jq22.css" rel="stylesheet" type="text/css" />
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script language='javascript' src="js/jq22.js"></script>
</head>
<body>
<div class='body_main'> 
  <!-- start main content -->
  <div class='index_box' style='margin-top:20px;'>
    <div style="position:fixed;color:red;margin:70px 0 0 450px;font-size:16px;Z-index:100;display:block;" id="hint"></div>
    <div class='box_title'>
      <div class='text_content'>
        <h1>用户注册</h1>
      </div>
    </div>
    <div class='box_main'>
      <div id="register" class="register">
        <form id="form" action="register.action" method="post" onSubmit="return check();" enctype="multipart/form-data">
          <div id="form_submit" class="form_submit">
            <div class="fieldset">
            	<div class="field-group">
                <label class="required title">登录账户</label>
                <span class="control-group" id="uname_input">
                <div class="input_add_long_background">
                  <input class="register_input" type="text" id="uname" name="uname" maxLength="16" value="" onblur="changeUname();">
                </div>
                </span>
                <label class="tips">请输入登录账户	</label>
             	 </div>
              <div class="field-group">
                <label class="required title">设置密码</label>
                <span class="control-group" id="password_input">
                <div class="input_add_long_background">
                  <input class="register_input" type="password" id="password" name="password" maxLength="20" value="" onblur="checkPwd1(this.value);" />
                </div>
                </span>
                <label class="tips">请使用6~20个英文字母（区分大小写）、符号或数字</label>
              </div>
              <div class="field-group">
                <label class="required title">企业邮箱</label>
                <span class="control-group" id="email_input">
                <div class="input_add_long_background">
                  <input class="register_input" type="text" id="email" name="email" maxLength="50" value="" onblur="__changeUserName('email');">
                </div>
                </span>
                <label class="tips">请输入您的企业邮箱</label>
              </div>
              <div class="field-group">
                <label class="required title">企业地址</label>
                <span class="control-group" id="address_input">
                <div class="input_add_long_background">
                  <input class="register_input" type="text" id="address" name="address"  value="" onblur="__changeUserName('address');">
                </div>
                </span>
                <label class="tips">请输入企业地址	</label>			
             	 </div>
             	 <div class="field-group">
                <label class="required title">工商照片</label>
                <span class="control-group" id="icbc_input">
                
                  <input class="register_input" type="file" id="icbc1" name="icbc1"  value="" >
               
                </span>
                <label class="tips">请上传企业工商照片	</label>
             	 </div>
             	 <div class="field-group">
                <label class="required title">身份证照片</label>
                <span class="control-group" id="identity_input">
                
                  <input class="register_input" type="file" id="identity1" name="icbc1"  value="" >
               
                </span>
                <label class="tips">请上传企业法人身份证照片	</label>
             	 </div>
              <div class="field-group">
                <label class="required title">注册身份</label>
                <span class="control-group" style="line-height:28px;">
                <input id="way_mobile" type="radio" value="1" name="status" checked onclick="__changeUserName('mobile');">
                供货商
                <input id="way_email" type="radio" value="2" name="status" onclick="__changeUserName('email');">
               医院 </span>
                <label class="tips" style="margin-bottom:5px;" id="tooltext1">请选择您的身份</label>
              </div>
              
              <div class="field-group">
                <label class="required title">邮箱验证码</label>
                <span class="control-group" id="code_input">
                <div class="input_add_background" style="margin-right:15px;">
                  <input class="register_input_ot" type="text" id="code" name="code" max_length="6" value="" onblur="checkAuthCode(this.value);">
                <a onclick="getEmail()">点击发送验证码</a>
                <input type="hidden" id="mess">
                </div>
                </span>
                <label class="tips">若尝试多次仍无法接收到邮箱验证码，请您联系在线客服帮您开通账号</label>
              </div>
            </div>
          </div>
          <div id="div_submit" class="div_submit">
            <div class='div_submit_button'>
              <input id="submit" type="submit" value="注册" class='button_button disabled'>
            </div>
          </div>
        </form>
      </div>
<script type="text/javascript">
function getEmail(){
	var e=$("#email").val();
	$.post("toemail.action",{"name":e},function(data){
		$("#mess").val(data);
	})
}
function __changeUserName(of){
  var username=$('#'+of).val();
  if(of=='email'){
	  if (username.search(/^[\w\.+-]+@[\w\.+-]+$/) == -1) {
			showTooltips('email_input','请输入正确的Email地址');
			return;
		}
	  
  }

  
}
var a=true;
function changeUname(){
	var uname=$("#uname").val();
	$.post("ajaxUname.action",{"uname":uname},function(data){
		if(data==1){
			showTooltips('uname_input',"该账号已被注册");
			a=false;
		}else{
			a=true;
		}
		
	});
}
function checkPwd1(pwd1) {
	if (pwd1.search(/^.{6,20}$/) == -1) {
		showTooltips('password_input','密码为空或位数太少');
	}else {
		hideTooltips('password_input');
	}
}	

function checkEmail(email) {
	if (email.search(/^.+@.+$/) == -1) {
		showTooltips('email_input','邮箱格式不正确');
	}else {
		hideTooltips('email_input');
	}
}

function checkAuthCode(authcode) {
	if (authcode == '' || authcode.length != 4) {
		showTooltips('code_input','验证码不正确');
	}else {
		hideTooltips('code_input');
 }     
}

function check() {
	hideAllTooltips();
	var ckh_result = true;
	if ($('#email').val() == '') {
	showTooltips('email_input','邮箱不能为空');
	ckh_result = false;
  }
	if ($('#icbc1').val() == '') {
	showTooltips('icbc_input','企业工商照不能为空');
	ckh_result = false;
  }
	if ($('#identity1').val() == '') {
		showTooltips('identity_input','身份证照片不能为空');
		ckh_result = false;
	  }
  if ($('#password').val() == '') {
	showTooltips('password_input','密码不能为空');
	ckh_result = false;
  }      
 
  if ($('#code').val() == '' || $('#code').val().length !=4) {
	showTooltips('code_input','验证码不正确');
	ckh_result = false;
  }

  if ($('#verify').attr('checked') == false){
	showTooltips('checkbox_input','对不起，您不同意Webluker的《使用协议》无法注册');
	ckh_result = false;
  }
  	var code=$("#code").val();
	var mess=$("#mess").val();
	if(code!=mess){
		Popout("验证码输入错误！");
		ckh_result = false;
	}
	if(a==false){
		showTooltips('uname_input',"该账号已被注册");
	}

  return ckh_result&&a;
}
	
	function Popout (str){
			$("body").append("<span id='tishi' style=' padding: 10px 20px; text-align: center;  background-color: blanchedalmond;  position: absolute;left: 50%;top: 50%;' >"+
			str+"</span>");
			setTimeout(function(){
				$("#tishi").remove();
			} ,3000);
		}
</script> 
    </div>
    <div class='box_bottom'></div>
  </div>
</div>

</body>
</html>
