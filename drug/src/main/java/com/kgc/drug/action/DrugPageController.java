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

import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DrugPageController {

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

	// 去药品已审核
	@RequestMapping("checkedDrug")
	public String checkedDrug(String pageindex, HttpServletRequest request, HttpServletResponse response) {
		if (pageindex == null || pageindex.equals("0")) {
			this.pageindex = 1;
		} else {
			this.pageindex = Integer.parseInt(pageindex);
		}
		List<DrugTable> us = usersService.getCheckedDrug(null, null);
		pages = us.size();
		if (pages % pag != 0) {
			count = (pages / pag) + 1;
		} else {
			count = (pages / pag);
		}
		List<DrugTable> us1 = usersService.getCheckedDrug((this.pageindex-1)*pag, pag);
		request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("us", us1);
		return "checkedDrug";
	}

	// 去药品待审核
	@RequestMapping("uncheckedDrug")
	public String uncheckedDrug(String pageindex, HttpServletRequest request, HttpServletResponse response) {
		if (pageindex == null || pageindex.equals("0")) {
			this.pageindex = 1;
		} else {
			this.pageindex = Integer.parseInt(pageindex);
		}
		List<DrugTable> us = usersService.getUnCheckedDrug(null, null);
		pages = us.size();
		if (pages % pag != 0) {
			count = (pages / pag) + 1;
		} else {
			count = (pages / pag);
		}
		List<DrugTable> us1 = usersService.getUnCheckedDrug((this.pageindex-1)*pag, pag);
		request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("us", us1);
		return "uncheckedDrug";
	}
	
	//审核同意后 修改药品 状态 为 已通过 并向供货商发送邮件提醒
		@RequestMapping("updateDrugYes")
		public String updateDrugYes(String didi,String uid,String pageindex, HttpServletRequest request, HttpServletResponse response) {
			try {
				Users u = usersService.getByUidUser(Integer.parseInt(uid));
				String email = u.getEmail();
				String from=email;
				String to="1738175165@qq.com";
				String title="HS";
				String mess="尊敬的供货商：恭喜您在我们平台上架的药品经核实后，上架成功！！！";
		
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
			
			int updateByIdDrugYes = usersService.updateByIdDrugYes(Integer.parseInt(didi));
			if (updateByIdDrugYes>0) {
				return checkedDrug(pageindex, request, response);
			}else {
				return uncheckedDrug(pageindex, request, response);
			}
		}
		
		//审核驳回后 修改药品  状态 为 未通过 并向供货商发送邮件提醒
		@RequestMapping("updateDrugNo")
		public String updateDrugNo(String didi,String uid,String pageindex, HttpServletRequest request, HttpServletResponse response) {
			try {
				Users u = usersService.getByUidUser(Integer.parseInt(uid));
				String email = u.getEmail();
				String from=email;
				String to="1738175165@qq.com";
				String title="HS";
				String mess="尊敬的供货商：您在我们平台上架的药品由于材料模糊或药品规格不达标，上架失败！！！";
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
			int updateByIdDrugNo = usersService.updateByIdDrugNo(Integer.parseInt(didi));
			if (updateByIdDrugNo>0) {
				return checkedDrug(pageindex, request, response);
			}else {
				return uncheckedDrug(pageindex, request, response);
			}
		}
	//点击删除按钮  删除指定的药
	@RequestMapping("deleteDrug")
	public String deleteDrug(String didi,String pageindex, HttpServletRequest request, HttpServletResponse response) {
		int deleteByIdDrug = usersService.deleteByIdDrug(Integer.parseInt(didi));
		if (deleteByIdDrug>0) {
			request.setAttribute("delete", "删除成功！！！");
		}else {
			request.setAttribute("delete", "删除失败！！！");
		}
		 	return checkedDrug(pageindex, request, response);
	}
	//去药品详情页
	@RequestMapping("xianqin1")
	public String xianQin(String didi,String uid, HttpServletRequest request, HttpServletResponse response) {
		DrugTable d=usersService.queryDrug(Integer.parseInt(didi));
		Users u=usersService.getByUidUser(Integer.parseInt(uid));
		request.setAttribute("d", d);
		request.setAttribute("u", u);
		return "xianqin1";
	}

}
