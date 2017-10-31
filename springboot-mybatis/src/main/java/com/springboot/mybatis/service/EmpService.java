package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.EmpEntity;
import com.springboot.mybatis.mapper.EmpEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpEntityMapper empEntityMapper;

    public List<EmpEntity> getListEmp(){
        return empEntityMapper.selectByExample(null);
    }
}
