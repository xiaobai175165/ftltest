package com.kgc.drug.service.impl;

import java.util.List;

import com.kgc.drug.common.PageBean;
import com.kgc.drug.dao.DrugDao1;
import com.kgc.drug.entity.*;
import com.kgc.drug.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DrugServiceImpl implements DrugService {
	@Autowired
	private DrugDao1 dao;

	@Override
	public List<Mintype> getType() {
		return dao.getType();
	}
 
	@Override
	public PageBean<Drug> getAllDrug(int typeid, String dname, int currPage, int pageSize) {
		int start=(currPage-1)*pageSize;
		List<Drug> list=dao.getDrug(typeid, dname, start, pageSize);
		int count=dao.getCount(typeid, dname);
		return new PageBean<Drug>(list, currPage, pageSize, count);
	}

	@Override
	public List<Maxtype> getMaxtype() {
		return dao.getMaxtype();
	}

	@Override
	public Drug getDrugByDid(int did) {
		
		return dao.getDrugByDid(did);
	}

	@Override
	public List<Drug> getDrugByName(String name) {
		return dao.getDrugByName(name);
	}

	@Override
	public int addgouwuche(int drugid, int uid, int count) {
		return dao.addgouwuche(drugid, uid, count);
	}

	@Override
	public List<Cart> getAllCartByDid(int uid) {
		return dao.getAllCartByDid(uid);
	}

	@Override
	public int deleteCartByCid(int cid) {
		return dao.deleteCartByCid(cid);
	}

	@Override
	public DrugTable querydrug(Integer did) {
		// TODO Auto-generated method stub
		return dao.querydrug(did);
	}

	@Override
	public int addOrder(Order o) {
		// TODO Auto-generated method stub
		return dao.addOrder(o);
	}
	

}
