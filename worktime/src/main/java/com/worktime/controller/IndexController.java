package com.worktime.controller;

import com.worktime.entity.Employee;
import com.worktime.service.EmployeeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private EmployeeServer employeeServer;

    //首页渲染
    @RequestMapping("/index")
    public String index(Model model){

        return "redirect:/main.html";
    }

    //账号管理渲染
    @RequestMapping("/empList")
    public String list(Model model){
        List<Employee> employees = employeeServer.getEmployeeList();
        model.addAttribute("empList",employees);
        return "employee/employeeList";
    }

    //数据管理渲染
    @RequestMapping("/dataTable")
    public String dataTable(int number,Model model){
        switch(number)
        {
            case 1 :
                return "dataTable/dataTableOne";
            case 2 :
                return "dataTable/dataTableTwo";
            case 3 :
                return "dataTable/dataTableThree";
            case 4 :
                return "dataTable/dataTableFour";
            case 5 :
                return "dataTable/dataTableFive";
            case 6 :
                return "dataTable/dataTableSix";
            case 7 :
                return "dataTable/dataTableSeven";
            case 8 :
                return "dataTable/dataTableEight";
            case 9 :
                return "dataTable/dataTableNine";
            case 10 :
                return "dataTable/dataTableTen";
            case 11 :
                return "dataTable/dataTableEleven";
            default :
                return "redirect:/main.html";
        }
    }
}
