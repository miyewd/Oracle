package com.cnpiec.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface UpdateTaskMapper {

    public void updateTaskJournal(List<String> list);

    @Select("SELECT J.TASKID FROM \"Sheet1\" S,BDC_TASK_JOURNAL J WHERE S.TASKID = J.TASKID" )
    public List<String> selectTaskId();

}
