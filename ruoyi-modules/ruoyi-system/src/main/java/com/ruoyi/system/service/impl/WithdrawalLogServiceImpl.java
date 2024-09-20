package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.WithdrawalLog;
import com.ruoyi.system.mapper.SysWithdrawalLogMapper;
import com.ruoyi.system.service.WithdrawalLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description: Withdrawal Log Service Implementation
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/6 14:42
 */
@Service
public class WithdrawalLogServiceImpl implements WithdrawalLogService {

	@Autowired
	private SysWithdrawalLogMapper sysWithdrawalLogMapper;

	@Override
	@Transactional
	public WithdrawalLog createWithdrawalLog(WithdrawalLog withdrawalLog) {
		sysWithdrawalLogMapper.insert(withdrawalLog);
		return withdrawalLog;
	}

	@Override
	public WithdrawalLog getWithdrawalLogById(Long id) {
		return sysWithdrawalLogMapper.selectById(id);
	}

	@Override
	public List<WithdrawalLog> getAllWithdrawalLogs() {
		return sysWithdrawalLogMapper.selectAll();
	}

	@Override
	@Transactional
	public WithdrawalLog updateWithdrawalLog(WithdrawalLog withdrawalLog) {
		sysWithdrawalLogMapper.updateById(withdrawalLog);
		return withdrawalLog;
	}

	@Override
	@Transactional
	public void deleteWithdrawalLog(Long id) {
		sysWithdrawalLogMapper.deleteById(id);
	}

	@Override
	public List<WithdrawalLog> getWithdrawalLogsByUsername(String username) {
		return sysWithdrawalLogMapper.selectByUsername(username);
	}

	@Override
	public List<WithdrawalLog> getWithdrawalLogsByStatus(WithdrawalLog.WithdrawalStatus status) {
		return sysWithdrawalLogMapper.selectByStatus(status.name());
	}
}
