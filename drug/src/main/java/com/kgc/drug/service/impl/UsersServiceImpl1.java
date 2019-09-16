package com.kgc.drug.service.impl;

import com.kgc.drug.dao.UserDao;
import com.kgc.drug.entity.Users;
import com.kgc.drug.service.UsersService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userserviceimpl")
public class UsersServiceImpl1 implements UsersService1 {
	@Autowired
	private UserDao userDao;
	@Override
	public Users login(String uname, String password) {
		
		return userDao.login(uname, password);
	}
	@Override
	public int addUsers(Users user) {
		return userDao.addUsers(user);
	}
	@Override
	public int ajaxUname(String uname) {
		return userDao.ajaxUname(uname);
	}

}
