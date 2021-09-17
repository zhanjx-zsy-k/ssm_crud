package com.atguigu.crud.dao;

import java.util.List;

import com.atguigu.crud.bean.*;
import com.atguigu.crud.bean.DepartmentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentMapper {
    long countByExample(Department example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer deptId);

    List<Department> selectByExampleWithDept(DepartmentExample example);

    Department selectByPrimaryKeyWithDept(Integer deptId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}