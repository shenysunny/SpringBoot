package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.EmpEntity;
import com.springboot.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/empController")
    public List<EmpEntity> empController(){
        return empService.getListEmp();
    }
}
