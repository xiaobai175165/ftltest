package com.kgc.drug.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.drug.entity.*;
import com.kgc.drug.service.DrugService;
import com.kgc.drug.service.DrugService1;
import com.kgc.drug.util.ExcelUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jdk.nashorn.internal.ir.annotations.Reference;

@Controller
public class DrugAction {
	private static final String Users = null;
	@Resource(name = "drugService")
	private DrugService1 drugService;
	@RequestMapping(value ="/doExcel", method = RequestMethod.POST)
	public  String doExcel(@RequestParam("excel") MultipartFile excel,HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		Users users=(Users)session.getAttribute("users");
		 if(excel.isEmpty()){
	            try {
	                throw new Exception("文件不存在！");
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	     }
	        InputStream in =null;
	        try {
	            in=excel.getInputStream();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        List<List<Object>> listob = null;
	        try {
	            listob = new ExcelUtils().getBankListByExcel(in,excel.getOriginalFilename());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        for (int i = 0; i < listob.size(); i++) {
	            List<Object> lo = listob.get(i);
	            Drug drug = new Drug();
	            drug.setDname(String.valueOf(lo.get(0)));
	            drug.setPinyin(String.valueOf(lo.get(1)));
	            drug.setBases(String.valueOf(lo.get(2)));
	            drug.setCharacter(String.valueOf(lo.get(3)));
	            drug.setFunction(String.valueOf(lo.get(4)));
	            drug.setUserlevel(String.valueOf(lo.get(5)));
	            drug.setUntowardeffect(String.valueOf(lo.get(6)));
	            drug.setAnnouncements(String.valueOf(lo.get(7)));
	            drug.setSpecification(String.valueOf(lo.get(8)));
	            drug.setPeriodofvalidity(String.valueOf(lo.get(9)));
	            drug.setApprovalnumber(String.valueOf(lo.get(10)));
	            drug.setAmount(Integer.valueOf(String.valueOf(lo.get(11))));
	            drug.setPrice(Double.valueOf(String.valueOf(lo.get(12))));
	            drug.setTypeid(Integer.valueOf(String.valueOf(lo.get(13))));
	            drug.setSupplierId(users.getUid());
	            drug.setPhoto("timg.jpg");
	            drugService.addDrug(drug);
	        }
		return "redirect:supplyInfo.action";
	}
	@RequestMapping("/nian1")
	public String  nian1(String goTime,String toTime,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("goTime1",goTime);
		session.setAttribute("toTime1",toTime);
		int pageIndex = 1;
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder(uid.getUid(),goTime, toTime,1);
		List<Order1> orderlist=drugService.getTimeOrder1(uid.getUid(),goTime,toTime,1, pageIndex,5);
		int count = orderlist1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("pageCount", pageCount);
	    return "nian1";
	}
	@RequestMapping("/nian2")
	public String  nian2(String goTime,String toTime,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("goTime2",goTime);
		session.setAttribute("toTime2",toTime);
		int pageIndex = 1;
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder(uid.getUid(),goTime, toTime,2);
		List<Order1> orderlist=drugService.getTimeOrder1(uid.getUid(),goTime,toTime,2, pageIndex,5);
		int count = orderlist1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("pageCount", pageCount);
	    return "nian2";
	}
	@RequestMapping("/nian5")
	public String  nian5(String goTime,String toTime,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("goTime5",goTime);
		session.setAttribute("toTime5",toTime);
		int pageIndex = 1;
	
		List<Order1> orderlist1=drugService.getTimeOrder5(goTime, toTime);
		List<Order1> orderlist=drugService.getTimeOrder6(goTime,toTime,(pageIndex-1)*5,5);
		int count = orderlist1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("pageCount", pageCount);
	    return "nian5";
	}
	@RequestMapping("p5")
	public String p5(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		String goTime=(String)session.getAttribute("goTime5");
		String toTime=(String)session.getAttribute("toTime5");
		int pageIndex=Integer.parseInt(pageIndex1);
	
		List<Order1> orderlist1=drugService.getTimeOrder5(goTime, toTime);
		int count=orderlist1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order1> orderlist=drugService.getTimeOrder6(goTime,toTime, (pageIndex-1)*5,5);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderlist",orderlist);
		request.setAttribute("pageCount",pageCount);
		return "nian5";
	}
	@RequestMapping("/nian3")
	public String  nian3(String goTime,String toTime,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("goTime3",goTime);
		session.setAttribute("toTime3",toTime);
		int pageIndex = 1;
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder2(uid.getUid(),goTime, toTime,1);
		List<Order1> orderlist=drugService.getTimeOrder3(uid.getUid(),goTime,toTime,1,(pageIndex-1)*5,5);
		int count = orderlist1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("pageCount", pageCount);
	    return "nian3";
	}
	@RequestMapping("/nian4")
	public String  nian4(String goTime,String toTime,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("goTime4",goTime);
		session.setAttribute("toTime4",toTime);
		int pageIndex = 1;
		System.out.println("sada");
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder2(uid.getUid(),goTime, toTime,2);
		List<Order1> orderlist=drugService.getTimeOrder3(uid.getUid(),goTime,toTime,2, (pageIndex-1)*5,5);
		System.out.println(orderlist1);
		int count = orderlist1.size();
		int pageCount = count / 5;
		if ((count % 5) != 0) {
			pageCount = pageCount + 1;
		}
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("pageCount", pageCount);
	    return "nian4";
	}
	@RequestMapping("p2")
	public String p2(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		String goTime=(String)session.getAttribute("goTime2");
		String toTime=(String)session.getAttribute("toTime2");
		int pageIndex=Integer.parseInt(pageIndex1);
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder(uid.getUid(),goTime, toTime,2);
		int count=orderlist1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order1> orderlist=drugService.getTimeOrder1(uid.getUid(),goTime,toTime,2, pageIndex,5);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderlist",orderlist);
		request.setAttribute("pageCount",pageCount);
		return "nian2";
	}
	@RequestMapping("p1")
	public String p1(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		String goTime=(String)session.getAttribute("goTime1");
		String toTime=(String)session.getAttribute("toTime1");
		int pageIndex=Integer.parseInt(pageIndex1);
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder(uid.getUid(),goTime, toTime,1);
		int count=orderlist1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order1> orderlist=drugService.getTimeOrder1(uid.getUid(),goTime,toTime,1, pageIndex,5);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderlist",orderlist);
		request.setAttribute("pageCount",pageCount);
		return "nian1";
	}
	@RequestMapping("p3")
	public String p3(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		String goTime=(String)session.getAttribute("goTime3");
		String toTime=(String)session.getAttribute("toTime3");
		System.out.println(goTime+"sadas");
		int pageIndex=Integer.parseInt(pageIndex1);
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder2(uid.getUid(),goTime, toTime,2);
		int count=orderlist1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order1> orderlist=drugService.getTimeOrder3(uid.getUid(),goTime,toTime,2,  (pageIndex-1)*5,5);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderlist",orderlist);
		request.setAttribute("pageCount",pageCount);
		return "nian3";
	}
	@RequestMapping("p4")
	public String p4(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		String goTime=(String)session.getAttribute("goTime4");
		String toTime=(String)session.getAttribute("toTime4");
		int pageIndex=Integer.parseInt(pageIndex1);
		Users uid=(Users) session.getAttribute("users");
		List<Order1> orderlist1=drugService.getTimeOrder2(uid.getUid(),goTime, toTime,1);
		int count=orderlist1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		List<Order1> orderlist=drugService.getTimeOrder3(uid.getUid(),goTime,toTime,1,  (pageIndex-1)*5,5);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("orderlist",orderlist);
		request.setAttribute("pageCount",pageCount);
		return "nian4";
	}
	@RequestMapping("/del")
	public String del(String id1,HttpServletRequest request){
		int id=Integer.parseInt(id1);
		drugService.deleteDrug(id);
		return "redirect:supplyInfo.action";
	}
	@RequestMapping("/update")
	public String update(String id1,HttpServletRequest request){
		HttpSession session=request.getSession();
		int id=Integer.parseInt(id1);
		session.setAttribute("id",id);
		Drug drug=drugService.getDrugById(id);
		request.setAttribute("dr",drug);
		return "updateInfo";
	}
	@RequestMapping("/doUpdate")
	public String doUpdate(String amount1,String price1,HttpServletRequest request){
		int amount=Integer.parseInt(amount1);
		double price=Double.parseDouble(price1);
		HttpSession session=request.getSession();
		int id=(int) session.getAttribute("id");
		drugService.updateCount(id,amount,price);
		return "redirect:supplyInfo.action";
	}
	@RequestMapping("/supplyInfo")
	public String supplyInfo(HttpServletRequest request){
		HttpSession session=request.getSession();
		Integer pageIndex1=(Integer)session.getAttribute("pageIndex");
		int pageIndex = 0;
		if(pageIndex1==null){
			pageIndex=1;
		}else {
			pageIndex=pageIndex1;
		}
		Users uid=(Users) session.getAttribute("users");
		List<Drug> drugList=drugService.getAllDrug(pageIndex,5,uid.getUid());
		List<Drug> drugList1=drugService.getAllDrug1(uid.getUid());
		int count=drugList1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		System.out.println(drugList);
		request.setAttribute("pageIndex",pageIndex);
		request.setAttribute("drugList",drugList);
		request.setAttribute("pageCount",pageCount);
		return "supplyInfo";
	}
	@RequestMapping("p")
	public String p(String pageIndex1,HttpServletRequest request){
		HttpSession session=request.getSession();
		Users uid=(Users) session.getAttribute("users");
		int pageIndex=Integer.parseInt(pageIndex1);
		List<Drug> drugList1=drugService.getAllDrug1(uid.getUid());
		int count=drugList1.size();
		int pageCount=count/5;
		if((count%5)!=0) {
			pageCount=pageCount+1;
		}
		if(pageIndex<1) {
			pageIndex=1;
		}else if(pageIndex>pageCount){
			pageIndex=pageCount;
		}
		
		session.setAttribute("pageIndex",pageIndex);
		List<Drug> drugList=drugService.getAllDrug(pageIndex,5,uid.getUid());
		request.setAttribute("pageIndex",pageIndex);
		
		request.setAttribute("drugList",drugList);
		request.setAttribute("pageCount",pageCount);
		return "supplyInfo";
	}
	@RequestMapping("/toAddDrug")
	public String toAddDrug(HttpServletRequest request){
		List<Mintype> list=drugService.getAllMin();
		request.setAttribute("list",list);
		HttpSession session=request.getSession();
		session.removeAttribute("pageIndex");
		return "addDrug";
	}
	@RequestMapping("/toExcel")
	public String toExcel(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.removeAttribute("pageIndex");
		return "excel";
	}
	@RequestMapping("/doAddDrug")
	public String doAddDrug(@RequestParam(value="pic",required=false)MultipartFile pic,Drug drug,HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		Users users=(Users)session.getAttribute("users");
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
				drug.setPhoto(fileNameOld);
				drug.setSupplierId(users.getUid());
				drugService.addDrug(drug);
			} catch (Exception e) {
				System.out.println("上传失败");
				e.printStackTrace();
			}
		}
		return "redirect:supplyInfo.action";
	}
	@RequestMapping("/tostart")
	public String toStart(){
		return "start";
	}
}
