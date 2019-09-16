package com.kgc.drug.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.OrderService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;




@Controller
public class OrderController {
	@Autowired
	private OrderService orderServiceImpl ;
	@RequestMapping("/findSales")
	public String findAll(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		int pageIndex=1;
		List<Sales> sales=orderServiceImpl.ordeFind(pageIndex,5,users.getUid());
		List<Sales> sales1=orderServiceImpl.ordeFind(pageIndex,null,users.getUid());
		int count = sales1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("sales",sales);
		return "sales";
	}
	@RequestMapping("p11")
	public String p1(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		int pageIndex=Integer.parseInt(pageIndex1);
		List<Sales> sales1=orderServiceImpl.ordeFind(pageIndex,null,users.getUid());
		int count=sales1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Sales> sales=orderServiceImpl.ordeFind(pageIndex,5,users.getUid());
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("sales",sales);
		request.setAttribute("pageCount",pageCount);
		return "sales";
	}
	@RequestMapping("/findOrder")
	public String findOrder(HttpServletRequest request) {
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		Integer pageIndex1=(Integer)session.getAttribute("pageIndex");
		int pageIndex = 0;
		if(pageIndex1==null){
			pageIndex=1;
		}else {
			pageIndex=pageIndex1;
		}
		List<Order> findOrder = orderServiceImpl.findOrder(pageIndex,5,users.getUid());
		List<Order> findOrder1=orderServiceImpl.findOrder(pageIndex,null,users.getUid());
		int count = findOrder1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		for (Order order : findOrder) {
			request.setAttribute("Takestatus", order.getTakestatus());
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("orderLiset", findOrder);
		return "order";
	}
	@RequestMapping("p12")
	public String p(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		int pageIndex=Integer.parseInt(pageIndex1);
		List<Order> findOrder1=orderServiceImpl.findOrder(pageIndex,null,users.getUid());
		int count=findOrder1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order> findOrder = orderServiceImpl.findOrder(pageIndex,5,users.getUid());
		
		for (Order order : findOrder) {
			request.setAttribute("Takestatus", order.getTakestatus());
		}
		session.setAttribute("pageIndex",pageIndex);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderLiset", findOrder);
		request.setAttribute("pageCount",pageCount);
		return "order";
	}
	@RequestMapping("/updateTakestatus")
	public String updataOrderTakestatus(String oid) {
		boolean updataOrderTakestatus = orderServiceImpl.updataOrderTakestatus(oid);
		if(updataOrderTakestatus) {
			return "redirect:findOrder.action";
		}else {
			return "404";
		}
	}
	@RequestMapping("/toReturn")
	public String toReturn(String oid,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("oid",oid);
		return "return";
	}
	@RequestMapping("/doR")
	public String doR(@RequestParam(value="pic",required=false)MultipartFile pic,String function,HttpServletRequest request) {
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		String oid=(String)session.getAttribute("oid");
		Order order=orderServiceImpl.getOrderById(oid);
		Sales sale=new Sales();
		if (!pic.isEmpty()) {
			String fileNameOld=pic.getOriginalFilename();
			String prefix=FilenameUtils.getExtension(fileNameOld);
			String pathReal=request.getSession().getServletContext().getRealPath(File.separator+"tupian");  
			File target=new File(pathReal,fileNameOld);
			if (!target.exists()) {
				target.mkdirs();
			}
			try {
				pic.transferTo(target);
				sale.setSid(oid);
				sale.setDrugid(order.getDrugid());
				sale.setTotalPrice(order.getTotalprice());
				sale.setBuytime(order.getBuytime());
				sale.setReturnPic(fileNameOld);
				sale.setReturnCause(function);
				sale.setUid(users.getUid());
				sale.setUdid(order.getUdid());
				orderServiceImpl.updataOrderTakestatus2(oid);
				orderServiceImpl.addSales(sale);
			} catch (Exception e) {
				System.out.println("上传失败");
				e.printStackTrace();
			}
		}
	    return "redirect:findOrder.action";
	}
}
