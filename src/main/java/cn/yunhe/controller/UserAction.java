package cn.yunhe.controller;

import cn.yunhe.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {
    @RequestMapping("/dome")
public String dod(String name, String age){
        System.out.println("name = "+name+ ",age="  + age );

        return "main";
    }
    @RequestMapping("/dome1")
    public String dod1(User user){
        System.out.println(user);
        return "main";
    }
}
