package com.spring.boot.web.text;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UserDao {
    public Integer addUser(String username){
        System.out.println("user dao addUser [username = " + username + "]");
        if (username == null){
          return  0;
        }else {
            return 1;
        }
    }
}
