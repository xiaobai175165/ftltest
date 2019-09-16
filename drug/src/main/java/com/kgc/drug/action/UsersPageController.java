package com.kgc.drug.action;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.drug.entity.Users;
import com.kgc.drug.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UsersPageController {

	@Autowired
	private UsersService usersService;
	// 每页几条
	private int pag = 6;
	// 总页数
	private int count;
	// 总条数
	private int pages;
	// 当前页
	private int pageindex = 1;

	// 去用户已审核
	@RequestMapping("checkedUser")
	public String checkedUser(String pageindex, HttpServletRequest request, HttpServletResponse response) {
		if (pageindex == null || pageindex.equals("0")) {
			this.pageindex = 1;
		} else {
			this.pageindex = Integer.parseInt(pageindex);
		}
		List<Users> us = usersService.getCheckedUsers(null, null);
		pages = us.size();
		if (pages % pag != 0) {
			count = (pages / pag) + 1;
		} else {
			count = (pages / pag);
		}
		List<Users> us1 = usersService.getCheckedUsers((this.pageindex-1)*pag, pag);
		request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("us", us1);
		return "checkedUser";
	}

	// 去用户待审核
	@RequestMapping("uncheckedUser")
	public String uncheckedUser(String pageindex, HttpServletRequest request, HttpServletResponse response) {
		if (pageindex == null || pageindex.equals("0")) {
			this.pageindex = 1;
		} else {
			this.pageindex = Integer.parseInt(pageindex);
		}
		List<Users> us = usersService.getUnCheckedUsers(null, null);
		pages = us.size();
		if (pages % pag != 0) {
			count = (pages / pag) + 1;
		} else {
			count = (pages / pag);
		}
		List<Users> us1 = usersService.getUnCheckedUsers((this.pageindex-1)*pag, pag);request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("us", us1);
		return "uncheckedUser";
	}
	
	//审核同意后 修改用户 状态 为 已通过
	@RequestMapping("updateUserYes")
	public String updateUserYes(String uid,String email,String pageindex, HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println(email);
			String from=email;
			String to="1738175165@qq.com";
			String title="HS";
			String mess="尊敬的用户：恭喜您在我们平台注册的账号经核实注册成功！！！";

			String s=from;
			int n=s.indexOf('@');
			String server=s.substring(n+1,s.length());
			Properties pro= System.getProperties();
			pro.put("mail.smtp.host","smtp.qq.com");
			pro.put("mail.smtp.port",465);
			pro.put("mail.smtp.auth","true");
			pro.put("mail.smtp.ssl.enable","true");
			pro.put("mail.transport.protocal","smtp");
			Session sess=Session.getInstance(pro);
			sess.setDebug(true);
			MimeMessage message=new MimeMessage(sess);
			InternetAddress from_mail=new InternetAddress("1738175165@qq.com");
			message.setFrom(from_mail);
			InternetAddress to_mail=new InternetAddress(from);
			message.setRecipient(Message.RecipientType.TO, to_mail);
			message.setSubject(title);
			message.setText(mess);
			message.setSentDate(new Date());
			message.saveChanges();
			Transport transport=sess.getTransport("smtp");
			transport.connect("1738175165@qq.com", "brdosbavvinybddc");
			transport.sendMessage(message,message.getAllRecipients());
			transport.close();
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		int updateByIdUser = usersService.updateByIdUserYes(Integer.parseInt(uid));
		if (updateByIdUser>0) {
			return checkedUser(pageindex, request, response);
		}else {
			return uncheckedUser(pageindex, request, response);
		}
	}
	
	
	
	//审核驳回后 修改用户 状态 为 未通过
	@RequestMapping("updateUserNo")
	public String updateUserNo(String uid,String email,String pageindex, HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println(email);
			String from=email;
			String to="1738175165@qq.com";
			String title="HS";
			String mess="尊敬的用户，您在我们平台注册的账号由于提供的材料模糊或信息不准确，注册失败！！！";
		
			String s=from;
			int n=s.indexOf('@');
			String server=s.substring(n+1,s.length());
			Properties pro= System.getProperties();
			pro.put("mail.smtp.host","smtp.qq.com");
			pro.put("mail.smtp.port",465);
			pro.put("mail.smtp.auth","true");
			pro.put("mail.smtp.ssl.enable","true");
			pro.put("mail.transport.protocal","smtp");
			Session sess=Session.getInstance(pro);
			sess.setDebug(true);
			MimeMessage message=new MimeMessage(sess);
			InternetAddress from_mail=new InternetAddress("1738175165@qq.com");
			message.setFrom(from_mail);
			InternetAddress to_mail=new InternetAddress(from);
			message.setRecipient(Message.RecipientType.TO, to_mail);
			message.setSubject(title);
			message.setText(mess);
			message.setSentDate(new Date());
			message.saveChanges();
			Transport transport=sess.getTransport("smtp");
			transport.connect("1738175165@qq.com", "brdosbavvinybddc");
			transport.sendMessage(message,message.getAllRecipients());
			transport.close();
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		int updateByIdUser = usersService.updateByIdUserNo(Integer.parseInt(uid));
		if (updateByIdUser>0) {
			return checkedUser(pageindex, request, response);
		}else {
			return uncheckedUser(pageindex, request, response);
		}
	}
	//点击删除按钮  删除指定的用户
	@RequestMapping("deleteUser")
	public String deleteUser(String uid,String pageindex, HttpServletRequest request, HttpServletResponse response) {
		int deleteByIdUser = usersService.deleteByIdUser(Integer.parseInt(uid));
		if (deleteByIdUser>0) {
			request.setAttribute("delete", "删除成功！！！");
		}else {
			request.setAttribute("delete", "删除失败！！！");
		}
		 	return checkedUser(pageindex, request, response);
	}
	
	//点击详情跳转用户详情页面
	@RequestMapping("xianqin")
	public String xianQin(String uid, HttpServletRequest request, HttpServletResponse response) {
		Users user = usersService.getByUidUser(Integer.parseInt(uid));
		request.setAttribute("user", user);
		return "xianqin";
	}

}
