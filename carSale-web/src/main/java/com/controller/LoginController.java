package com.controller;

import com.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("goMain")
    public String goMain(HttpSession session){
        Object object=session.getAttribute("employee");
        if(object==null){
            return "login";
        }else {
            Employee employee=(Employee)object;
            if(employee.getPositionId()==1){
                return "AdminMain";
            }else {
                return "EmpMain";
            }
        }
    }
}