package com.cnpiec.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnpiec.demo.service.UpdateTaskJournalService;
import com.cnpiec.demo.util.ListUtils;

@Controller
public class UpdateTaskJournalController {
    @Autowired
    private UpdateTaskJournalService updateTaskJournalService;

    @RequestMapping("updateTaskJournal")
    @ResponseBody
    public String updateTaskJournal() {
        try {
            List<String> list = updateTaskJournalService.selectTaskId();
            List<List<String>> list2 = ListUtils.splitList(list, 1000);
            for (List<String> list3 : list2) {
               updateTaskJournalService.updateTaskJournal(list3);
            }
            return "suc";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
