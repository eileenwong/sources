package com.worktime.dao;

import com.worktime.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    //查询账号列表
    List<Employee> getEmployeeList();
    //通过用户名和密码或者信息
    int getEmployeeByNW(@Param("worknumber") String worknumber,@Param("password") String password);
    //添加账号方法
    int addEmployee(Employee employee);
    //修改账号方法
    int updateEmployee(Employee employee);
    //根据ID查询数据
    Employee getEmployeeById(Integer id);
    //根据ID删除数据
    int delEmployee(Integer id);
}
