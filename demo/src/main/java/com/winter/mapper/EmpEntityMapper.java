package com.winter.mapper;

import java.util.List;
import com.winter.model.EmpEntity;
import com.winter.model.EmpEntityExample;
import org.apache.ibatis.annotations.Param;

public interface EmpEntityMapper {
    int countByExample(EmpEntityExample example);

    int deleteByExample(EmpEntityExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(EmpEntity record);

    int insertSelective(EmpEntity record);

    List<EmpEntity> selectByExample(EmpEntityExample example);

    EmpEntity selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") EmpEntity record, @Param("example") EmpEntityExample example);

    int updateByExample(@Param("record") EmpEntity record, @Param("example") EmpEntityExample example);

    int updateByPrimaryKeySelective(EmpEntity record);

    int updateByPrimaryKey(EmpEntity record);
}