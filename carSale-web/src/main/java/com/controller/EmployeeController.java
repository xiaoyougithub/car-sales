package com.controller;

import com.bean.Company;
import com.bean.Employee;
import com.service.CompanyService;
import com.service.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    private Logger logger=Logger.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

    /**
     * 根据公司id和职位id判断员工是否存在
     * @param companyId
     * @param positionId
     * @param empName
     * @return
     */
    @ResponseBody
    @RequestMapping("isEmpExist")
    public Long isEmpExist(int companyId,int positionId,String empName){
        return employeeService.isEmpExist(companyId,positionId,empName);
    }

    @ResponseBody
    @RequestMapping("isEmpPhoneExist")
    public int isPhoneExist(Integer companyId,Integer positionId,String empName,String empPhone ){
        Employee employee=new Employee(companyId,positionId,empName,empPhone);
        Employee employee1=null;
        employee1=employeeService.selectEmployeeByObj(employee);
        logger.debug(employee1);
        if (employee1!=null){
            return 1;
        }
        return 0;
    }

    @ResponseBody
    @RequestMapping("isPasswordTrue")
    public int isPasswordTrue(HttpSession session, Integer companyId, Integer positionId, String empPassword, String empPhone){
        Employee employee=new Employee(positionId,empPhone,companyId,empPassword);
        Employee employee1=null;
        employee1=employeeService.selectEmployeeByObj(employee);
        if(employee1!=null){
            Company company=companyService.selectCompanyById(employee1.getCompanyId());
            session.setAttribute("employee",employee1);
            session.setAttribute("company",company);
            return 1;
        }
        return 0;
    }
}