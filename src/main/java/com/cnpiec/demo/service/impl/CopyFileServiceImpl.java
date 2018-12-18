package com.cnpiec.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnpiec.demo.dao.CopyFileMapper;
import com.cnpiec.demo.service.CopyFileService;

@Service
public class CopyFileServiceImpl implements CopyFileService {
    @Autowired
    private CopyFileMapper copyFileMapper;

    @Override
    public List<Map<String,String>> getFilePath() {
        return copyFileMapper.getFilePath();
    }

    @Override
    public List<String> getTaskId(String name) {
        return copyFileMapper.getTaskId(name);
    }

    @Override
    public List<String> getXml(String taskId) {
        return copyFileMapper.getXMl(taskId);
    }
    
    
}
