package com.cnpiec.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnpiec.demo.dao.BIPRangeMapper;
import com.cnpiec.demo.model.BIPRange;
import com.cnpiec.demo.service.BIPRangeService;

@Service
public class BIPRangeServiceImpl implements BIPRangeService {
    @Autowired
    private BIPRangeMapper bIpRangeDao;

    @Override
    public List<BIPRange> selectBIPRange() {
        List<BIPRange> list = bIpRangeDao.selectBIPRange();
        return list;
    }

}
