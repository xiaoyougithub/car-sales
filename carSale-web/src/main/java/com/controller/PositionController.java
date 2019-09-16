package com.controller;

import com.bean.Position;
import com.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 职位控制器
 */
@Controller
@RequestMapping("position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    /**
     * 获取职位列表
     * @return
     */
    @ResponseBody
    @RequestMapping("list")
    public List<Position> selectPosition(){
        return positionService.selectPosition(null);
    }
}