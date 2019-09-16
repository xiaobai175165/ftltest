package com.kgc.drug.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.kgc.drug.common.PageBean;
import com.kgc.drug.entity.*;
import com.kgc.drug.service.DrugService;
import com.kgc.drug.util.AlipayConfig;
import com.kgc.drug.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DrugController {
	@Autowired
	private DrugService drugService;
	
	@RequestMapping("index")
	public String index(HttpServletRequest request,HttpServletResponse response) {
		List<Maxtype> maxList=drugService.getMaxtype();
		List<Mintype> list=drugService.getType();
		request.setAttribute("max", maxList);
		request.setAttribute("type", list);
		return "index";
	}
	
	//鏌ヨ鎵�鏈変腑鑽�
	@RequestMapping("zhongyao")
	public String getAll(Model model,Integer id,Integer pageindex) {
		int pageSize=5;
		if(pageindex==null) {
			pageindex=1;
		}
		PageBean<Drug> allStu = drugService.getAllDrug(id, null, pageindex, pageSize);
		List<Drug> list = allStu.getList();
		model.addAttribute("pb", allStu);
		model.addAttribute("id", id);
		return "zhongyao"; 
	}
	//鏌ョ湅鑽搧璇︽儏
	@RequestMapping("xiangqing")
	public String getDrugByPinYin(int id,Model model) {
		Drug drug = drugService.getDrugByDid(id);
		model.addAttribute("drug", drug);
		return "xiangqing";
	}
	//鏌ヨ鎵�鏈夎タ鑽�
	@RequestMapping("xiyao")
	public String getXiyao(Model model,Integer id,Integer currPage) {
		int pageSize=5;
		if(currPage==null) {
			currPage=1;
		}
		PageBean<Drug> allStu = drugService.getAllDrug(id, null, currPage, pageSize);
		List<Drug> list = allStu.getList();
		model.addAttribute("pb", allStu);
		model.addAttribute("id", id);
		return "xiyao";
	}
	
	//鍘绘寜鑽搧鍚嶆煡璇㈢晫闈�
	@RequestMapping("toquery")
	public String toquery() {
		return "chaxun";
	}
	
	//閫氳繃鑽搧鍚嶆煡璇㈣嵂鍝佸尯鍒嗗巶瀹�
	@RequestMapping("query")
	public String query(Model model,String dname) {
		List<Drug> list=drugService.getDrugByName(dname);
		System.out.println(list);
		model.addAttribute("list", list);
		return "chaxun";
	}
	//添加购物车
	@RequestMapping("addgouwuche")
	public void addgouwuche(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		//整合需要在此添加session 
		Users users = (Users)session.getAttribute("users");
		int uid=users.getUid();//取session中的user 的 id 取代1
		int drugid=Integer.parseInt(request.getParameter("drugid"));
		int count=Integer.parseInt(request.getParameter("count"));
		System.out.println(drugid+"-------- "+count);
		int i=drugService.addgouwuche(drugid, uid, count);
		response.getWriter().print(i);
	}
	//去购物车页面
	@RequestMapping("toCart")
	public String toCart(HttpServletRequest request,HttpSession session) {
		//整合需要在此添加session 
		Users users = (Users)session.getAttribute("users");
		int uid=users.getUid();//取session中的user 的 id 取代
		List<Cart> allCartByDid = drugService.getAllCartByDid(uid);
		
		request.setAttribute("allCartByDid", allCartByDid);
		return "cart";
		
	}
	//删除购物车某一条
	@RequestMapping("shanchu")
	public String shanchu(String cid) {
		int cid1=Integer.parseInt(cid);
		drugService.deleteCartByCid(cid1);
		return "redirect:toCart.action";
		
	}
	//批量删除购物车某一条
	@RequestMapping("shanchu1")
	public String shanchu1(String cids,HttpServletRequest request) {
		String[] strs = cids.split(",");
		for (int i = 0; i < strs.length; i++) {
			int cid=Integer.parseInt(strs[i]);
			drugService.deleteCartByCid(cid);
		}
		return "redirect:toCart.action";
	}
	@RequestMapping("zifu")
	public String zifu1(String cids,String zongjia,String dids,String counts,HttpServletRequest request) {
		
		request.setAttribute("WIDout_trade_no", UUIDUtil.getCode());
		request.setAttribute("WIDtotal_amount", zongjia);
		request.setAttribute("WIDsubject", "药品采购");
		request.setAttribute("WIDbody", "药品");
		request.setAttribute("cids", cids);
		request.setAttribute("dids", dids);
		request.setAttribute("counts", counts);
		return "alipay.trade.page.pay";
		
	}
	@RequestMapping("zifu1")
	public String zifu(HttpServletRequest request,HttpServletResponse response) throws IOException, AlipayApiException {
		PrintWriter out = response.getWriter();
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

		//——请在这里编写您的程序（以下代码仅作参考）——
		if(signVerified) {
			//商户订单号
			String cids = new String(request.getParameter("cids").getBytes("ISO-8859-1"),"UTF-8");
		
			//支付宝交易号
			String dids = new String(request.getParameter("dids").getBytes("ISO-8859-1"),"UTF-8");
		
			//付款金额
			String counts = new String(request.getParameter("counts").getBytes("ISO-8859-1"),"UTF-8");
			
			String[] strs = cids.split(",");
			for (int i = 0; i < strs.length; i++) {
				int cid=Integer.parseInt(strs[i]);
				drugService.deleteCartByCid(cid);
			}
			String[] count=counts.split(",");
			strs=dids.split(",");
			System.out.println(counts);
		HttpSession session=request.getSession();
		Users user=(Users) session.getAttribute("users");
			for (int i = 0; i < strs.length; i++) {
			DrugTable d=drugService.querydrug(Integer.parseInt(strs[i]));
			Double zongjia=d.getPrice()*Double.parseDouble(count[i]);
			Order o=new Order();
			o.setOid(UUIDUtil.getCode());
			o.setCount(Integer.parseInt(count[i]));
			o.setDrugid(Integer.parseInt(strs[i]));
			o.setUdid(user.getUid());
			o.setUdid(d.getSupplierId());
			o.setTotalprice(zongjia);
			int a=drugService.addOrder(o);
			System.out.println(a);
			}
			
			return "redirect:toCart.action";
		
			
		}else {
			return "redirect:toCart.action";
		}
	}
	
}
