package com.controller;

import com.bean.Employee;
import com.common.PhoneMessageUtil;
import com.service.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("register")
public class RegisterController {

    private Logger logger=Logger.getLogger(RegisterController.class);

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("yes")
    public int isPhoneExist(int companyId,String phone){
        int row = employeeService.isPhoneExist(companyId, phone);
        return row;
    }

    /**
     * @description: 给注册手机发送短信验证码
     * @param: empPhoneNumber：员工注册手机号码
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-05-03 23:17
     **/
    @RequestMapping("/sendPhoneMessage")
    @ResponseBody
    public Map<String, String> sendPhoneMesseger(String empPhoneNumber,int companyId){
        Map<String,String> map = new HashMap<String, String>();

        int row = employeeService.isPhoneExist(companyId, empPhoneNumber);
        if(row!=0){
            map.put("resultRegister","手机号已被注册");
            return map;
        }

        logger.debug("开始--发送手机短信的方法");

        String authcode = PhoneMessageUtil.genRandomNum(4);
        logger.debug("手机验证码,生成验证码:"+authcode);

        if(PhoneMessageUtil.sandMassage(authcode,empPhoneNumber)){
            logger.debug("验证码发送成功,发送号码:"+empPhoneNumber);
            map.put("resultRegister","6666");
        }else{
            logger.debug("验证码发送失败,发送号码:"+empPhoneNumber);
            map.put("resultRegister","false");
        }
        logger.debug("结束--发送手机短信的方法");
        return map;
    }

    @RequestMapping("registerSuccess")
    public String registerSuccess(Employee employee){
        employee.setPositionId(3);
        if (employeeService.insertEmployee(employee)==1){
            return "EmpMain";
        }else return "login";
    }
}