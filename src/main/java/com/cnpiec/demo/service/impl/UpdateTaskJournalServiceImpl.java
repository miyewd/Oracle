package com.cnpiec.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnpiec.demo.dao.UpdateTaskMapper;
import com.cnpiec.demo.service.UpdateTaskJournalService;

@Service
public class UpdateTaskJournalServiceImpl implements UpdateTaskJournalService {

    @Autowired
    private UpdateTaskMapper updateTaskMapper;

    @Override
    public void updateTaskJournal(List<String> list3) {
        updateTaskMapper.updateTaskJournal(list3);
    }

    @Override
    public List<String> selectTaskId() {
        List<String> list = updateTaskMapper.selectTaskId();
        return list;
    }

}
