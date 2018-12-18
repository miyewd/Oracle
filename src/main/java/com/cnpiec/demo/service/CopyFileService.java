package com.cnpiec.demo.service;

import java.util.List;
import java.util.Map;

public interface CopyFileService {
    public List<Map<String,String>> getFilePath();

    public  List<String> getTaskId(String name);

    public List<String> getXml(String taskId);
}
