package com.ruoyi.system.service;



import com.ruoyi.system.domain.SysAdData;

import java.time.LocalDate;
import java.util.List;

public interface SysAdDataService {
	List<SysAdData> getAllData();

	SysAdData getDataById(Long id);

	List<SysAdData> getDataByDateRange(LocalDate startDate, LocalDate endDate);

	SysAdData createData(SysAdData sysAdData);

	SysAdData updateData(Long id, SysAdData sysAdData);

	void deleteData(Long id);
}
