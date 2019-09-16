package com.kgc.drug.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.OrderService1;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Supply2action {
	//ÿҳ����
		private int pag=6;
		//��ҳ��
		private int count;
		//������
		private int pages;
		//��ǰҳ
		private int pageindex=1;
	@Resource(name = "orderService")
	private OrderService1 orderService;
	//ȥ�ɹ��������
	@RequestMapping("tolist")
	public String toorder(String pageindex,HttpServletRequest request,HttpServletResponse response) {
		if(pageindex==null) {
			this.pageindex=1;
		}else {
			this.pageindex=Integer.parseInt(pageindex);
		}
		HttpSession session=request.getSession();
		Users user=(Users) session.getAttribute("users");
		
		List<Order>  Olist=(List<Order>) orderService.queryorders(user.getUid());
		pages=Olist.size();
		if(pages%pag!=0) {
			count=(pages/pag)+1;
		}else {
			count=(pages/pag);
		}
		List<Order>  olist=orderService.limitorder(user.getUid(),(this.pageindex-1)*pag, pag);
		List<Users> ulist=orderService.queryusers();
		List<DrugTable> dlist=orderService.queryDrugs();
		request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("olist", olist);
		request.setAttribute("ulist", ulist);
		request.setAttribute("dlist", dlist);
		return "unchecked";
	}
	//ȥ�˻��������
	@RequestMapping("tosales")
	public String tosales(String pageindex,HttpServletRequest request,HttpServletResponse response) {
		if(pageindex==null) {
			this.pageindex=1;
		}else {
			this.pageindex=Integer.parseInt(pageindex);
		}
		HttpSession session=request.getSession();
		Users user=(Users) session.getAttribute("users");
		
		List<Sales>  Olist=(List<Sales>) orderService.querySaless(user.getUid());
		pages=Olist.size();
		if(pages%pag!=0) {
			count=(pages/pag)+1;
		}else {
			count=(pages/pag);
		}
		List<Sales>  olist=orderService.limitsales(user.getUid(),(this.pageindex-1)*pag, pag);
		List<Users> ulist=orderService.queryusers();
		List<DrugTable> dlist=orderService.queryDrugs();
		request.setAttribute("pageindex", this.pageindex);
		request.setAttribute("count", count);
		request.setAttribute("olist", olist);
		request.setAttribute("ulist", ulist);
		request.setAttribute("dlist", dlist);
		return "uncheckedsales";
	}
	//ȥ��ҳ
	@RequestMapping("order")
	public String order() {
		return "start";
	}
	//ȥ��ҳ
	@RequestMapping("dindanhao")
	public String dindanhao(String oid,HttpServletRequest request,HttpServletResponse response) {
		Order o=orderService.queryor(oid);
		Users u=null;
		DrugTable d=null;
		try {
			u=orderService.queryuser(o.getUdid());
			
			d=orderService.queryDrug(o.getDrugid());
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("mes", "δ�ҵ��õ��ţ����ʵ������");
		}
	
		request.setAttribute("list", o);
		request.setAttribute("u", u);
		
		request.setAttribute("d", d);
		return "danhao";
	}
	//ȥ��ҳ
		@RequestMapping("todindanhao")
		public String todindanhao(HttpServletRequest request,HttpServletResponse response) {
			return "danhao";
		}
	//ȥ�˻�����ҳ
	@RequestMapping("/salesxianqing")
	public String salesxianqing(String sid,HttpServletRequest request,HttpServletResponse response) {
		Sales s=orderService.querySales(sid);
		Users u=orderService.queryuser(s.getUid());
		DrugTable d=orderService.queryDrug(s.getDrugid());
		request.setAttribute("s", s);
		request.setAttribute("d",d);
		request.setAttribute("u", u);
		return "salesxian";
	}
	//
	@RequestMapping("fahuo")
	public void fahuo(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String oid=request.getParameter("oid");
		Integer count=Integer.parseInt(request.getParameter("count"));
		Integer did=Integer.parseInt(request.getParameter("did"));
		System.out.println(oid);
		System.out.println(did);
		int a=orderService.updatekucun(did, count);		
		a=orderService.updatestatus(oid);
		out.print(a);
		out.flush();
		out.close();
	}
	@RequestMapping("update2")
	public String update() {
		return "updatamiam";
	}
	@RequestMapping("updatamima")
	public String updatemima(HttpServletRequest request,HttpServletResponse response) {
		String uname=request.getParameter("uname");
		System.out.println(uname);
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String pwd=request.getParameter("password");
		HttpSession session=request.getSession();
		Users u=(Users) session.getAttribute("users");
		u.setUname(uname);
		u.setEmail(email);
		u.setAddress(address);
		u.setPassword(pwd);
		int a=orderService.updatamima(u);
		if(a>0) {
			return "redirect:exit.action";
		}else {
			return "redirect:update2.action";
		}
		
	}
	@RequestMapping("updatesales")
	public String updatesales(String oid,HttpServletRequest request) {
		orderService.updatasales(oid);
		orderService.updataor(oid);
		return "redirect:tosales.action";
	}
}
