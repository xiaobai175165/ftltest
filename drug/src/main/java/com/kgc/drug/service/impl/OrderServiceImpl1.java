package com.kgc.drug.service.impl;

import java.util.List;

import com.kgc.drug.dao.OrderDao;
import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.OrderService1;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl1 implements OrderService1 {
	@Autowired
	private OrderDao orderDao;

	@Override
	public Users queryuser(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.queryuser(id);
	}

	@Override
	public List<Order> queryorders(Integer udid) {
		// TODO Auto-generated method stub
		return orderDao.queryorders(udid);
	}

	@Override
	public DrugTable queryDrug(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.queryDrug(id);
	}

	@Override
	public List<Users> queryusers() {
		// TODO Auto-generated method stub
		return orderDao.queryusers();
	}

	@Override
	public List<DrugTable> queryDrugs() {
		// TODO Auto-generated method stub
		return orderDao.queryDrugs();
	}

	@Override
	public List<Sales> querySaless(Integer udid) {
		// TODO Auto-generated method stub
		return orderDao.querySaless(udid);
	}

	@Override
	public Sales querySales(String sid) {
		// TODO Auto-generated method stub
		return orderDao.querySales(sid);
	}

	@Override
	public List<Order> limitorder(Integer udid,Integer page, Integer size) {
		// TODO Auto-generated method stub
		return orderDao.limitorder(udid,page, size);
	}

	@Override
	public List<Sales> limitsales(Integer udid,Integer page, Integer size) {
		// TODO Auto-generated method stub
		return orderDao.limitsales(udid,page, size);
	}

	@Override
	public int updatekucun(Integer did, Integer count) {
		// TODO Auto-generated method stub
		return orderDao.updatekucun(did, count);
	}

	@Override
	public int updatestatus(String oid) {
		// TODO Auto-generated method stub
		return orderDao.updatestatus(oid);
	}

	@Override
	public int updatamima(Users u) {
		// TODO Auto-generated method stub
		return orderDao.updatamima(u);
	}

	@Override
	public int updatasales(String oid) {
		// TODO Auto-generated method stub
		return orderDao.updatasales(oid);
	}

	@Override
	public int updataor(String oid) {
		// TODO Auto-generated method stub
		return orderDao.updataor(oid);
	}

	@Override
	public Order queryor(String oid) {
		// TODO Auto-generated method stub
		return orderDao.queryor(oid);
	}
}
