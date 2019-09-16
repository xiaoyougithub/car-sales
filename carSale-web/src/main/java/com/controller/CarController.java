package com.controller;

import com.bean.Car;
import com.bean.Customer;
import com.bean.Employee;
import com.bean.Repertory;
import com.service.CarService;
import com.service.CustomerService;
import com.service.EmployeeService;
import com.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 汽车销售管理
 */
@Controller
@RequestMapping("car")
public class CarController {

    @Autowired
    private RepertoryService repertoryService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CarService carService;

    @Autowired
    private EmployeeService employeeService;
    private int companyId;

    /**
     * 根据companyId获取顾客列表
     * @param companyId
     * @return
     */
    @RequestMapping("customerList")
    @ResponseBody
    public List<Customer> customerListByCompanyId(int companyId){
        return customerService.selectCustomerByCompanyId(companyId);
    }

    /**
     * 获取汽车列表
     * @return
     */
    @RequestMapping("carList")
    @ResponseBody
    public List<Car> carList(){
        return carService.selectCar(null);
    }

    /**
     * 根据公司id和职位id获得销售员列表
     * @param companyId
     * @param positionId
     * @return
     */
    @ResponseBody
    @RequestMapping("salemenList")
    public List<Employee> employeeList(int companyId,int positionId){
        return employeeService.getSalemenList(companyId,positionId);
    }

    @RequestMapping("main")
    public String mainPage(int empId){
        Employee employee = employeeService.selectEmployeeById(empId);
        if(employee.getPositionId()==1){
            return "AdminSaleList";
        }
        return "EmpSaleList";
    }

//    @RequestMapping("repositoryCarList")
//    @ResponseBody
//    public Map<String,List<Repertory>> repertoryList(int companyId){
//        return repertoryService.selectRepertory(companyId);
//    }
    @RequestMapping("repositoryCarList")
    @ResponseBody
    public List<Repertory> repertoryList(int companyId){
        return repertoryService.getRepositoryListByCompanyId(companyId);
    }

}