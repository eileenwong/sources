package com.worktime.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.worktime.config.DemoDAO;
import com.worktime.dao.EmployeeMapper;
import com.worktime.entity.Employee;
import com.worktime.service.EmployeeServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("EmployeeServer")
@Slf4j
public class EmployeeServerImpl implements EmployeeServer {

    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private DemoDAO demoDAO;
    //查询账号列表
    @Override
    public List<Employee> getEmployeeList() {
        return employeeMapper.getEmployeeList();
    }
    //添加账号方法
    @Override
    public int addProject(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }
    //修改账号方法
    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
    //根据ID查询数据
    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }
    //通过用户名和密码或者信息
    @Override
    public int getEmployeeByNW(String worknumber, String password) {
        return  employeeMapper.getEmployeeByNW(worknumber,password);
    }
    //根据ID删除数据
    @Override
    public int delEmployee(Integer id) {
        return employeeMapper.delEmployee(id);
    }

    @Override
    public Boolean easyExcelText() {
        // 写法2
        String fileName = "C:\\Users\\MLoong\\Desktop\\文件\\simpleWrite" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, Employee.class).sheet("模板").doWrite(employeeMapper.getEmployeeList());

        return null;
    }

    @Override
    public Boolean easyExcelUpload(String file) {
        file = "C:\\Users\\MLoong\\Desktop\\文件\\simpleWrite1650243829771.xlsx";
        // 写法2：
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(file, Employee.class, new ReadListener<Employee>() {
            /**
             * 单次缓存的数据量
             */
            public static final int BATCH_COUNT = 2;
            /**
             *临时存储
             */
            private List<Employee> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

            @Override
            public void invoke(Employee data, AnalysisContext context) {
                data.setId(null);
                System.out.println(data);
                cachedDataList.add(data);
                if (cachedDataList.size() >= BATCH_COUNT) {
                    saveData();
                    // 存储完成清理 list
                    cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                saveData();
            }

            /**
             * 加上存储数据库
             */
            private void saveData() {
                log.info("{}条数据，开始存储数据库！", cachedDataList.size());
                demoDAO.save(cachedDataList);
                log.info("存储数据库成功！");
            }
        }).sheet().doRead();
        return true;
    }
}
