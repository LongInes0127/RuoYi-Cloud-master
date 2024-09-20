package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.WithdrawalLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/6 14:47
 */
@Mapper
public interface SysWithdrawalLogMapper {
	int insert(WithdrawalLog withdrawalLog);

	WithdrawalLog selectById(Long id);

	List<WithdrawalLog> selectAll();

	int updateById(WithdrawalLog withdrawalLog);

	int deleteById(Long id);

	List<WithdrawalLog> selectByUsername(String username);

	List<WithdrawalLog> selectByStatus(String status);
}
