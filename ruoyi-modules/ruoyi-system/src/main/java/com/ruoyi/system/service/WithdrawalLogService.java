package com.ruoyi.system.service;

import com.ruoyi.system.domain.WithdrawalLog;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/6 14:38
 */

@Component
public interface WithdrawalLogService {
	WithdrawalLog createWithdrawalLog(WithdrawalLog withdrawalLog);

	WithdrawalLog getWithdrawalLogById(Long id);

	List<WithdrawalLog> getAllWithdrawalLogs();

	WithdrawalLog updateWithdrawalLog(WithdrawalLog withdrawalLog);

	void deleteWithdrawalLog(Long id);

	List<WithdrawalLog> getWithdrawalLogsByUsername(String username);

	List<WithdrawalLog> getWithdrawalLogsByStatus(WithdrawalLog.WithdrawalStatus status);
}
