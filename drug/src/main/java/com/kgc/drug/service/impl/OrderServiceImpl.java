package com.kgc.drug.service.impl;

import java.util.List;

import com.kgc.drug.dao.OrderMapper;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public List<Sales> ordeFind(Integer pageIndex, Integer pageSize, Integer id) {
		Integer num=null;
		if(pageSize!=null) {
			num=(pageIndex-1)*pageSize;
		}else {
			num=1;
		}
		return orderMapper.ordeFind(num, pageSize, id);
	}
	@Override
	public List<Order> findOrder(Integer pageIndex, Integer pageSize, Integer id) {
		Integer num=null;
		if(pageSize!=null) {
			num=(pageIndex-1)*pageSize;
		}else {
			num=1;
		}
		return orderMapper.findOrder(num,pageSize,id);
	}
	@Override
	public boolean updataOrderTakestatus(String oid) {
		int updataOrderTakestatus = orderMapper.updataOrderTakestatus(oid);
		if (updataOrderTakestatus == 1) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean updataOrderTakestatus2(String oid) {
		int updataOrderTakestatus = orderMapper.updataOrderTakestatus2(oid);
		if (updataOrderTakestatus == 1) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Order getOrderById(String oid) {
		return orderMapper.getOrderById(oid);
	}
	@Override
	public int addSales(Sales s) {
		return orderMapper.addSales(s);
	}
}
