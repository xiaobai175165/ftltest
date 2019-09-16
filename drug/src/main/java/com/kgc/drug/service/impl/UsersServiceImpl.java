package com.kgc.drug.service.impl;

import java.util.List;

import com.kgc.drug.dao.OrderDao;
import com.kgc.drug.dao.UsersDao;
import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private UsersDao usersDao;

	@Override
	public List<Users> getCheckedUsers(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return usersDao.getCheckedUsers(page, size);
	}

	@Override
	public int getUserCount() {
		// TODO Auto-generated method stub
		return usersDao.getUserCount();
	}

	@Override
	public List<Users> getUnCheckedUsers(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return usersDao.getUnCheckedUsers(page, size);
	}

	@Override
	public List<DrugTable> getCheckedDrug(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return usersDao.getCheckedDrug(page, size);
	}

	@Override
	public List<DrugTable> getUnCheckedDrug(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return usersDao.getUnCheckedDrug(page, size);
	}

	@Override
	public int getDrugCount() {
		// TODO Auto-generated method stub
		return usersDao.getDrugCount();
	}

	@Override
	public int updateByIdUserYes(Integer uid) {
		// TODO Auto-generated method stub
		return usersDao.updateByIdUserYes(uid);
	}

	@Override
	public int updateByIdUserNo(Integer uid) {
		// TODO Auto-generated method stub
		return usersDao.updateByIdUserNo(uid);
	}

	@Override
	public int updateByIdDrugYes(Integer didi) {
		// TODO Auto-generated method stub
		return usersDao.updateByIdDrugYes(didi);
	}

	@Override
	public int updateByIdDrugNo(Integer didi) {
		// TODO Auto-generated method stub
		return usersDao.updateByIdDrugNo(didi);
	}

	@Override
	public int deleteByIdUser(Integer uid) {
		// TODO Auto-generated method stub
		return usersDao.deleteByIdUser(uid);
	}

	@Override
	public int deleteByIdDrug(Integer didi) {
		// TODO Auto-generated method stub
		return usersDao.deleteByIdDrug(didi);
	}

	@Override
	public Users getByUidUser(Integer uid) {
		// TODO Auto-generated method stub
		return usersDao.getByUidUser(uid);
	}

	@Override
	public DrugTable queryDrug(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.queryDrug(id);
	}
	
	

}
