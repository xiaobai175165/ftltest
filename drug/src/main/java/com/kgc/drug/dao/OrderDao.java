package com.kgc.drug.dao;

import java.util.List;

import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Sales;
import com.kgc.drug.entity.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrderDao {
	public List<Order> limitorder(@Param("udid") Integer udid, @Param("page") Integer page, @Param("size") Integer size);
	public List<Sales> limitsales(@Param("udid") Integer udid, @Param("page") Integer page, @Param("size") Integer size);
	public Users queryuser(Integer id);
	public List<Order> queryorders(@Param("udid") Integer udid);
	public List<Sales> querySaless(@Param("udid") Integer udid);
	public DrugTable queryDrug(Integer id);
	public List<Users> queryusers();
	public List<DrugTable> queryDrugs();
	public Sales querySales(String sid);
	public Order queryor(String oid);
	public int  updatekucun(@Param("did") Integer did, @Param("count") Integer count);
	public int updatestatus(String oid);
	public int updatamima(Users u);
	public int updatasales(String oid);
	public int updataor(String oid);
}
