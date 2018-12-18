package com.cnpiec.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface CopyFileMapper {
    @Select("SELECT PATH,ISSUE FROM FILE_TABLE ORDER BY PATH")
    List<Map<String,String>> getFilePath();

    @Select("SELECT TASKID FROM BDC_TASK_JOURNAL WHERE NAME = #{name}")
    List<String> getTaskId(String name);

    @Select("SELECT FILENAME FROM BDC_TASK_JOURNAL_FILE WHERE TASKID = #{taskId}  AND FILE_TYPE = 'xml' ")
    List<String> getXMl(String taskId);
}
