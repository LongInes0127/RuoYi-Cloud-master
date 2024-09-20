package com.ruoyi.system.controller;

import com.ruoyi.system.domain.SysAdData;
import com.ruoyi.system.service.SysAdDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/sys-ad-data")
public class SysAdDataController {

    private SysAdDataService sysAdDataService;

    private static final Logger logger = LoggerFactory.getLogger(SysAdDataController.class);

    @Autowired
    public SysAdDataController(SysAdDataService sysAdDataService) {
        this.sysAdDataService = sysAdDataService;
    }

    @GetMapping
    public List<SysAdData> getAllData() {
        logger.info("Received request to get all data");
        try {
            List<SysAdData> result = sysAdDataService.getAllData();
            logger.info("Successfully retrieved {} records", result.size());
            return result;
        } catch (Exception e) {
            logger.error("Error retrieving all data", e);
            throw e;
        }
    }

    @GetMapping("/{id}")
    public SysAdData getDataById(@PathVariable Long id) {
        return sysAdDataService.getDataById(id);
    }

    @GetMapping("/by-date-range")
    public List<SysAdData> getDataByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return sysAdDataService.getDataByDateRange(startDate, endDate);
    }

    @PostMapping
    public SysAdData createData(@RequestBody SysAdData sysAdData) {
        return sysAdDataService.createData(sysAdData);
    }

    @PutMapping("/{id}")
    public SysAdData updateData(@PathVariable Long id, @RequestBody SysAdData sysAdData) {
        return sysAdDataService.updateData(id, sysAdData);
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable Long id) {
        sysAdDataService.deleteData(id);
    }
}
