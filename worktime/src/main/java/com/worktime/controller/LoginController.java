package com.worktime.controller;

import com.worktime.dao.EmployeeMapper;
import com.worktime.service.EmployeeServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource(name = "EmployeeServer")
    private EmployeeServer employeeServer;

    //登录方法
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("WorkNumber") String worknumber,
            @RequestParam("PassWord") String password,
            Model model, HttpSession session){
        if (employeeServer.getEmployeeByNW(worknumber, password)>0) {
            //登录成功后，往session中传入值
            session.setAttribute("loginUser",worknumber);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或者密码错误！");
            return "login";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/main.html";
    }
}
