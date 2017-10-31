package com.spring.boot.web.aop;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void add(String username , String password){
        System.out.println("username: "+username +"       password: " + password);
    }
}
