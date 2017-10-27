package com.spring.boot.web.controller;
import org.springframework.web.bind.annotation.*;

/**
 * 控制层
 */
@RestController
public class UserController {

    @RequestMapping("/home" )
    public String home(){
        return "user home";
    }

    @RequestMapping("/home/ {id}" )
    public String display(@PathVariable String id){
        return "user display";
    }

    @PostMapping("user")
    public String user(@RequestPart(value = "usernamr",required = false)String usernamr , @RequestPart("password")String password){
        return "hello ---> user";
    }
}
