package com.winter.mapper;

import com.winter.model.EmpEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmpEntityMapper.class)
public class EmpEntityMapperTest {

    @Autowired
    private EmpEntityMapper empEntityMapper;

    @Test
    public void countByExample() throws Exception {
        List<EmpEntity> list = empEntityMapper.selectByExample(null);
        System.out.println(list.size());
    }

}