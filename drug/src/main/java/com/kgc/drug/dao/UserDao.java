package com.kgc.drug.dao;

import com.kgc.drug.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;




@Mapper
public interface UserDao {
	Users login(@Param("uname") String uname, @Param("password") String password);
	int addUsers(Users user);
	int ajaxUname(@Param("uname") String uname);
}
