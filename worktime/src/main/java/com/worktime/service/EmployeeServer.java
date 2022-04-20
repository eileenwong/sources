package com.worktime.service;

import com.worktime.entity.Employee;

import java.util.List;

public interface EmployeeServer {
    //查询账号列表
    List<Employee> getEmployeeList();
    //通过用户名和密码或者信息
    int getEmployeeByNW(String worknumber,String password);
    //添加账号方法
    int addProject(Employee employee);
    //修改账号方法
    int updateEmployee(Employee employee);
    //根据ID查询数据
    Employee getEmployeeById(Integer id);
    //根据ID删除数据
    int delEmployee(Integer id);
    //下载Excel文件
    Boolean easyExcelText();
    //读取Excel文件
    Boolean easyExcelUpload(String file);
}
