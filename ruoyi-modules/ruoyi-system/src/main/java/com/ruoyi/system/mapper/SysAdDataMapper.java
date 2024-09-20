package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysAdData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface SysAdDataMapper {
	List<SysAdData> getAllData();

	SysAdData getDataById(Long id);

	List<SysAdData> getDataByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

	void insertData(SysAdData sysAdData);

	void updateData(SysAdData sysAdData);

	void deleteData(Long id);
}
