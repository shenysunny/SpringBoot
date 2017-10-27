package com.spring.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController  {

    @RequestMapping("/login" )
    public ModelAndView login(ModelAndView model){
        System.out.println("login");
        // 将注册相信保存到model中
        model.addObject("username", "username");
        // 保存转发的地址
        model.setViewName("forward:index.html");
        // 转发到相应页面
        return model;
    }
}
