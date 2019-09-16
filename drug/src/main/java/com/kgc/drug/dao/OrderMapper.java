package com.kgc.drug.dao;

import java.util.List;

import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrderMapper {
	List<Sales> ordeFind(@Param("num") Integer num, @Param("pageSize") Integer pageSize, @Param("id") Integer id);
	List<Order> findOrder(@Param("num") Integer num, @Param("pageSize") Integer pageSize, @Param("id") Integer id);
	int updataOrderTakestatus(@Param("oid") String oid);
	int updataOrderTakestatus2(@Param("oid") String oid);
	int addSales(Sales s);
	Order getOrderById(String oid);
}
