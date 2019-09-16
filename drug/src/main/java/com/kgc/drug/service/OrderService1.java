package com.kgc.drug.service;

import java.util.List;

import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.entity.Users;

import org.apache.ibatis.annotations.Param;



public interface OrderService1 {
	public Users queryuser(Integer id);
	public List<Order> queryorders(Integer udid);
	public DrugTable queryDrug(Integer id);
	public List<Users> queryusers();
	public List<DrugTable> queryDrugs();
	public List<Sales> querySaless(Integer udid);
	public Sales querySales(String sid);
	public List<Order> limitorder(Integer udid, Integer page, Integer size);
	public List<Sales> limitsales(Integer udid, Integer page, Integer size);
	public int  updatekucun(Integer did, Integer count);
	public int updatestatus(String oid);
	public int updatamima(Users u);
	public int updatasales(String oid);
	public int updataor(String oid);
	public Order queryor(String oid);
}
