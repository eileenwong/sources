package com.worktime.config;

import com.worktime.dao.EmployeeMapper;
import com.worktime.entity.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 假设这个是你的DAO存储。当然还要这个类让spring管理，当然你不用需要存储，也不需要这个类。
 **/
@Service
public class DemoDAO {
    @Resource
    public EmployeeMapper employeeMapper;

    public void save(List<Employee> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
        for (Employee employee:list) {
            employeeMapper.addEmployee(employee);
        }
    }
}