package com.controller;

import com.bean.Company;
import com.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @RequestMapping("list")
    public List<Company> selectCompany(){
        return companyService.selectCompany(null);
    }

    /**
     * 根据公司名获取公司id，无论有没有该公司
     * @param companyName
     * @return
     */
    @ResponseBody
    @RequestMapping("getCompanyIdByName")
    public int getCompanyIdByName(String companyName){

        int companyNameExist = companyService.isCompanyNameExist(companyName);
        if(companyNameExist==0){
            Company company = new Company();
            company.setCompanyName(companyName);
            int result = companyService.insertCompany(company);
        }
        Company company = companyService.selectCompanyByName(companyName);
        return company.getCompanyId();
    }
}