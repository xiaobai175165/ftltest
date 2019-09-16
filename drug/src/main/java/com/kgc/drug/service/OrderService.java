package com.kgc.drug.service;

import java.util.List;

import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import org.apache.ibatis.annotations.Param;


public interface OrderService{
	List<Sales> ordeFind(Integer pageIndex, Integer pageSize, Integer id);
	List<Order> findOrder(Integer pageIndex, Integer pageSize, Integer id);
	boolean updataOrderTakestatus(String oid);
	boolean updataOrderTakestatus2(String oid);
	Order getOrderById(String oid);
	int addSales(Sales s);
}
