package com.demo.demo2.action;





import com.demo.demo2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;



@Controller
public class Useraction {
    @Autowired
    private TestService testService;

    @RequestMapping("/aaa")
    public String AAA(){
        System.out.println("sada");
        return "aaaa";
    }
    @RequestMapping("{name}/dohahah")
    public String hahah(@PathVariable(value = "name" ,required = false)String name, HttpServletRequest request){
        System.out.println("name="+name);
        return  "doindex";
    }
}
