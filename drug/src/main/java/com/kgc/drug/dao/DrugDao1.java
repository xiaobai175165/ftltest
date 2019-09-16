package com.kgc.drug.dao;

import java.util.List;

import com.kgc.drug.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface DrugDao1 {
	List<Maxtype> getMaxtype();//鏌ヨ澶х被鍒�?
	
	List<Mintype> getType();//鏌ヨ灏忕被鍒�
	
	List<Drug> getDrug(@Param("typeid") int typeid, @Param("dname") String dname, @Param("currPage") Integer currPage, @Param("pageSize") Integer pageSize);//鏌ヨ鑽搧鍒楄�?
	
	int getCount(@Param("typeid") int typeid, @Param("dname") String dname);//鏌ヨ鑽搧鎬绘暟閲�?
	
	Drug getDrugByDid(int did);//鏌ヨ鑽搧璇︽�?
	
	List<Drug> getDrugByName(String dname);//鏍规嵁鑽搧鍚嶆煡璇㈠悇涓巶�?��
	
	int addgouwuche(@Param("drugid") int drugid, @Param("uid") int uid, @Param("count") int count);//添加购物�?
	
	List<Cart> getAllCartByDid(@Param("uid") int uid);//查询购物�?
	
	int deleteCartByCid(@Param("cid") int cid);//删除�?条购物车
	DrugTable querydrug(Integer did);
	int addOrder(Order o);
}
