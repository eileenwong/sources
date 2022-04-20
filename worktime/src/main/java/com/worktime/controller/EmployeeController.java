package com.worktime.controller;

import com.worktime.entity.Employee;
import com.worktime.service.EmployeeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServer employeeServer;

    //添加账号页面渲染
    @GetMapping("/empAdd")
    public String employeeAdd(){
        return "employee/employeeAdd";
    }

    //添加账号方法
    @PostMapping("/empAdd")
    public String employeeAddRealize(Employee employee){
        employeeServer.addProject(employee);
        return "redirect:/empList";
    }

    //修改账号页面渲染
    @GetMapping("/empUpdate/{id}")
    public String employeeUpdate(@PathVariable("id") Integer id,Model model){
        model.addAttribute("emp",employeeServer.getEmployeeById(id));
        return "employee/employeeUpdate";
    }

    //修改账号方法
    @PostMapping("/empUpdate")
    public String employeeUpdateRealize(Employee employee){
        employeeServer.updateEmployee(employee);
        return "redirect:/empList";
    }

    //删除账号
    @GetMapping("/empDelete/{id}")
    public String employeedelete(@PathVariable("id") Integer id){
        employeeServer.delEmployee(id);
        return "redirect:/empList";
    }

    //下载excel
    @GetMapping("/downloadExcel")
    public String employeeDownloadEcxel(Model model){
        employeeServer.easyExcelText();
        model.addAttribute("msg","下载成功");
        return "redirect:/empList";
    }

    //上传excel
    @PostMapping("/uploadExcel")
    public String employeeUploadEcxel(String file){
        employeeServer.easyExcelUpload(file);
        return "redirect:/empList";
    }

}
