package com.cnpiec.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cnpiec.demo.model.BInstitution;
import com.cnpiec.demo.model.JR;

public interface CounterMapper {
    @Select("SELECT ACCESSACCOUNT,OA_STATUS FROM BDC_INS_INSTITUTION WHERE CNP_STATUS = 1")
    List<BInstitution> selectAllAccountId();

    @Select("SELECT JOURNALID FROM AC_UPM_ORDER WHERE ACCESS_ACCOUNT = #{accessAccount} GROUP BY JOURNALID")
    List<String> getSubJournalId(String accessAccount);

    @Select("SELECT * FROM LOG_COUNTER_TEMP WHERE ACCOUNTID = #{accessAccount}")
    List<JR> selectCountTempByAccessAcount(String accessAccount);
}
