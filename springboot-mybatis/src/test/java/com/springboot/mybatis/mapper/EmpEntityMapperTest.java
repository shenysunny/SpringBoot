package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.EmpEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmpEntityMapper.class)
@MapperScan("com.springboot.mybatis.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class EmpEntityMapperTest {

    @Autowired
    private EmpEntityMapper empEntityMapper;
    @Test
    public void serectText() throws Exception {
        List<EmpEntity> list = empEntityMapper.selectByExample(null);
        System.out.println(list.size());
    }


}