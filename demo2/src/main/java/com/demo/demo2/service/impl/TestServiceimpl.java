package com.demo.demo2.service.impl;




import com.demo.demo2.dao.UserMapper;
import com.demo.demo2.entity.User;
import com.demo.demo2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceimpl implements TestService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> query() {
        return userMapper.query();
    }
}
