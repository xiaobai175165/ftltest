package com.kgc.ftltest.dao;


import com.kgc.ftltest.entity.User;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    public List<User> query();
}
