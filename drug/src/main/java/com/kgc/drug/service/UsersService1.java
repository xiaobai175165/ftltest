package com.kgc.drug.service;


import com.kgc.drug.entity.Users;

public interface UsersService1 {
	Users login(String uname, String password);
	int addUsers(Users user);
	int ajaxUname(String uname);
}
