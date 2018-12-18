package com.cnpiec.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnpiec.demo.model.BIPRange;
import com.cnpiec.demo.service.BIPRangeService;

@Controller
public class BIPRangeController {
    
    @Autowired
    private BIPRangeService bIPRangeService;
    
    @ResponseBody
    @RequestMapping("selectBIpRange")
    public List<BIPRange> selectBIpRange() {
        return bIPRangeService.selectBIPRange();
    }

}
