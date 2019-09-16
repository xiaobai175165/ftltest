package com.kgc.drug.service.impl;

import java.util.List;

import com.kgc.drug.dao.DrugDao;
import com.kgc.drug.entity.Drug;
import com.kgc.drug.entity.Mintype;
import com.kgc.drug.entity.Order;

import com.kgc.drug.entity.Order1;
import com.kgc.drug.service.DrugService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("drugService")
public class DrugServiceImpl1 implements DrugService1 {
	@Autowired
	private DrugDao drugDao;
	@Override
	public int addDrug(Drug drug) {
		return drugDao.addDrug(drug);
	}
	@Override
	public List<Mintype> getAllMin() {
		return drugDao.getAllMin();
	}
	@Override
	public List<Drug> getAllDrug(Integer pageIndex, Integer pageSize, Integer id) {
		int num=(pageIndex-1)*pageSize;
		return drugDao.getAllDrug(num, pageSize,id);
	}
	@Override
	public int updateCount(Integer id, Integer count,double price) {
		return drugDao.updateCount(id, count,price);
	}
	@Override
	public int deleteDrug(int id) {
		return drugDao.deleteDrug(id);
	}
	@Override
	public List<Drug> getAllDrug1(int id) {
		return drugDao.getAllDrug1(id);
	}
	@Override
	public Drug getDrugById(int id) {
		return drugDao.getDrugById(id);
	}
	@Override
	public List<Order1> getTimeOrder(int id, String goTime, String toTime, Integer xuanze) {
		return drugDao.getTimeOrder(id,goTime, toTime,xuanze);
	}
	@Override
	public List<Order1> getTimeOrder1(int id, String goTime, String toTime, Integer xuanze, Integer pageIndex,
			Integer pageSize) {
		int num=(pageIndex-1)*pageSize;
		return drugDao.getTimeOrder1(id, goTime, toTime, xuanze, num, pageSize);
	}
	@Override
	public List<Order1> getTimeOrder2(int id, String goTime, String toTime, Integer xuanze) {
		// TODO Auto-generated method stub
		return drugDao.getTimeOrder2(id, goTime, toTime, xuanze);
	}
	@Override
	public List<Order1> getTimeOrder3(int id, String goTime, String toTime, Integer xuanze, Integer num,
			Integer pageSize) {
		// TODO Auto-generated method stub
		return drugDao.getTimeOrder3(id, goTime, toTime, xuanze, num, pageSize);
	}
	@Override
	public List<Order1> getTimeOrder5(String goTime, String toTime) {
		// TODO Auto-generated method stub
		return drugDao.getTimeOrder5(goTime, toTime);
	}
	@Override
	public List<Order1> getTimeOrder6(String goTime, String toTime, Integer num, Integer pageSize) {
		// TODO Auto-generated method stub
		return drugDao.getTimeOrder6(goTime, toTime,  num, pageSize);
	}
}
