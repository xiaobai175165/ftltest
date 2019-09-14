package com.kgc.ftltest.action;



import com.kgc.ftltest.entity.User;
import com.kgc.ftltest.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class Useraction {
    @Autowired
    private TestService testService;

    @RequestMapping("/query")
    public String query(HttpServletRequest request){
        List<User> userlist=testService.query();
        request.setAttribute("userlist",userlist);
        return "index";
    }
    @RequestMapping("{name}/dohahah")
    public String hahah(@PathVariable(value = "name" ,required = false)String name, HttpServletRequest request){
        System.out.println("name="+name);
        request.setAttribute("name",name);
        return  "toindex";
    }
}
