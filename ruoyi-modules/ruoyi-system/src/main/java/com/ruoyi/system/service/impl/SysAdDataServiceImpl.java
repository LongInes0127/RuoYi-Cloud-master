package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysAdData;
import com.ruoyi.system.mapper.SysAdDataMapper;
import com.ruoyi.system.service.SysAdDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SysAdDataServiceImpl implements SysAdDataService {

    private final SysAdDataMapper sysAdDataMapper;

    @Autowired
    public SysAdDataServiceImpl(SysAdDataMapper sysAdDataMapper) {
        this.sysAdDataMapper = sysAdDataMapper;
    }

    @Override
    public List<SysAdData> getAllData() {
        return sysAdDataMapper.getAllData();
    }

    @Override
    public SysAdData getDataById(Long id) {
        return sysAdDataMapper.getDataById(id);
    }

    @Override
    public List<SysAdData> getDataByDateRange(LocalDate startDate, LocalDate endDate) {
        return sysAdDataMapper.getDataByDateRange(startDate, endDate);
    }

    @Override
    public SysAdData createData(SysAdData sysAdData) {
        sysAdDataMapper.insertData(sysAdData);
        return sysAdData;
    }

    @Override
    public SysAdData updateData(Long id, SysAdData sysAdData) {
        sysAdData.setId(id);
        sysAdDataMapper.updateData(sysAdData);
        return sysAdData;
    }

    @Override
    public void deleteData(Long id) {
        sysAdDataMapper.deleteData(id);
    }
}
