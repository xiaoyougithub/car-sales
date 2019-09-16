package com.controller;

import com.bean.Carbrand;
import com.service.CarbrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class Test {

    @Autowired
    private CarbrandService carbrandService;

    @RequestMapping("list")
    @ResponseBody
    public Carbrand list(){
        return carbrandService.selectCarbrandById(new Integer(1));
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }

}