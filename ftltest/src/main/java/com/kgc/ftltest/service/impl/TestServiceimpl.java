package com.kgc.ftltest.service.impl;




import com.kgc.ftltest.dao.UserMapper;
import com.kgc.ftltest.entity.User;
import com.kgc.ftltest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Service
public class TestServiceimpl implements TestService {
    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public List<User> query() {

        try {
            int i=1/0;
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动回滚
        }finally {
            return userMapper.query();
        }


    }
}
