package com.kgc.drug.service;

import java.util.List;

import com.kgc.drug.common.PageBean;
import com.kgc.drug.entity.*;
import org.apache.ibatis.annotations.Param;



public interface DrugService {
	//查询大类型
	List<Maxtype> getMaxtype();
	//查询小类型
	List<Mintype> getType();
	//查询所有药品
	PageBean<Drug> getAllDrug(@Param("typeid") int typeid, @Param("dname") String dname, int currPage, int pageSize);
	//通过id查询药品详情
	Drug getDrugByDid(int did);
	//通过药品名查询药品区分厂家
	List<Drug> getDrugByName(String name);
	//添加到购物车
	int addgouwuche(int drugid, int uid, int count);
	//展示购物车
	List<Cart> getAllCartByDid(int uid);
	//删除一条购物车
	int deleteCartByCid(int cid);
	DrugTable querydrug(Integer did);
	int addOrder(Order o);
}
