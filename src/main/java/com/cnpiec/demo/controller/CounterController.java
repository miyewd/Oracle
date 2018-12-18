package com.cnpiec.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnpiec.demo.dao.CounterMapper;
import com.cnpiec.demo.model.BInstitution;
import com.cnpiec.demo.model.JR;

@RequestMapping("test")
@Controller
public class CounterController {

    @Autowired
    private CounterMapper cm;

    @RequestMapping("/count")
    @ResponseBody
    public int getCount() {
        int num = 0;
        // 查询所有机构
        List<BInstitution> list = cm.selectAllAccountId();
        // 查询所有机构订阅的刊的数量
        for (BInstitution ins : list) {
            String accessAccount = ins.getAccessaccount();
            //根据机构ID查询统计记录
            List<JR> accjr1List = cm.selectCountTempByAccessAcount(accessAccount);
            System.out.println(accjr1List.size());
            // 查询机构订阅的刊
            List<String> journalIdList = cm.getSubJournalId(accessAccount);
            System.out.println("订阅的刊数量:"+journalIdList.size());
            num += journalIdList.size();
        }
        // 返回总共的数量
        return num;
    }
}
