package com.kgc.drug.action;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.drug.entity.Users;
import com.kgc.drug.service.UsersService1;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jdk.nashorn.internal.ir.annotations.Reference;



@Controller
public class UsersController {
	@Resource(name = "userserviceimpl")
	private UsersService1 usersService;
	@RequestMapping("/login")
	public String login(String uname,String password,HttpServletRequest request,HttpSession session) {
	System.out.println(uname);
		Users users = usersService.login(uname, password);
		if(users==null) {
			request.setAttribute("cuowu", "	�˺������������");
			return "login";
		}
		session.setAttribute("users", users);
		if(users.getStatus()==1) {
		return "redirect:order.action";}
		else if(users.getStatus()==0){
			return "admin";
		}else {
			return "redirect:index.action";
		}
	}

	@RequestMapping("/register")
	public String register(HttpServletRequest request,Users user,@RequestParam(value="icbc1",required=false)MultipartFile[] icbc1) {
		
		for (int i = 0; i < icbc1.length; i++) {
			if (!icbc1[i].isEmpty()) {
				String fileNameOld=icbc1[i].getOriginalFilename();
				System.out.println(fileNameOld);
				String prefix=FilenameUtils.getExtension(fileNameOld);
				String pathReal=request.getSession().getServletContext().getRealPath(File.separator+"tupian");
				
				if (prefix.equalsIgnoreCase("jpg")||prefix.equalsIgnoreCase("png")||prefix.equalsIgnoreCase("jpeg")||prefix.equalsIgnoreCase("pneg")) {
					File target=new File(pathReal,fileNameOld);
					if (!target.exists()) {
						target.mkdirs();
					}
					try {
						icbc1[i].transferTo(target);
						if(i==0) {
							user.setIcbc(fileNameOld);
						}
						if(i==1) {
							user.setIdentity(fileNameOld);
						}
						
					} catch (Exception e) {
						System.out.println("�ϴ�ʧ��");
						e.printStackTrace();
					}
				} else {
					System.out.println("�ϴ���ʽ����ȷ");
				}
			} else {
				System.out.println("û����");
			}
		}
		int i=usersService.addUsers(user);
		if(i==1) {
			request.setAttribute("zc", "ע��ɹ�,�˺���������У����ͨ�����ʼ�֪ͨ");
		}
		return "login";
	}
	@RequestMapping("/toemail")
	private void toemail(HttpServletRequest request,HttpServletResponse response)throws Exception {
		try {
			String from=request.getParameter("name");
			System.out.println(from);
			String to="1738175165@qq.com";
			String title="HS";
			int mess;
			do {
				mess=(int)(Math.random()*10000);
			}while(mess<1000);
			
			HttpSession session = request.getSession();
			session.setAttribute("mess", mess);
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
			message.setText("�𾴵��û���������֤��Ϊ��"+mess);
			message.setSentDate(new Date());
			message.saveChanges();
			Transport transport=sess.getTransport("smtp");
			transport.connect("1738175165@qq.com", "brdosbavvinybddc");
			transport.sendMessage(message,message.getAllRecipients());
			transport.close();
			response.getWriter().print(mess);
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		 
		
	 }
	@RequestMapping("/ajaxUname")
	private void ajaxUname(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String uname=request.getParameter("uname");
		int i = usersService.ajaxUname(uname);
		response.getWriter().print(i);
	}
	@RequestMapping("exit")
	public String exit(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.removeAttribute("users");
		return "login";
	}
}
