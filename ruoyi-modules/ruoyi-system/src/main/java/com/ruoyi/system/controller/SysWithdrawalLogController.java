package com.ruoyi.system.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.system.domain.WithdrawalLog;
import com.ruoyi.system.service.WithdrawalLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/6 14:43
 */
@RestController
@RequestMapping("/api")
public class SysWithdrawalLogController extends BaseController {

	@Autowired
	private WithdrawalLogService withdrawalLogService;

	@PostMapping("/withdrawal-logs")
	public ResponseEntity<WithdrawalLog> createWithdrawalLog(@RequestBody WithdrawalLog withdrawalLog) {
		WithdrawalLog createdLog = withdrawalLogService.createWithdrawalLog(withdrawalLog);
		return ResponseEntity.ok(createdLog);
	}

}
