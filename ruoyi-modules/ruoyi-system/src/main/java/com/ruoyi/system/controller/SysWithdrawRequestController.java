package com.ruoyi.system.controller;

import com.ruoyi.system.domain.SysWithdrawRequest;
import com.ruoyi.system.service.SysWithdrawRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/withdraw")
public class SysWithdrawRequestController {

    @Autowired
    private SysWithdrawRequestService sysWithdrawRequestService;

    /**
     * 创建新的提现请求
     * @param withdrawRequest 提现请求信息
     * @return 返回创建的请求结果
     */
    @PostMapping("/create")
    public ResponseEntity<SysWithdrawRequest> createWithdrawRequest(@RequestBody SysWithdrawRequest withdrawRequest) {
        SysWithdrawRequest createdRequest = sysWithdrawRequestService.createWithdrawRequest(withdrawRequest);
        return ResponseEntity.ok(createdRequest);
    }

    /**
     * 查询所有提现请求
     * @return 提现请求列表
     */
    @GetMapping("/all")
    public ResponseEntity<List<SysWithdrawRequest>> getAllWithdrawRequests() {
        List<SysWithdrawRequest> withdrawRequests = sysWithdrawRequestService.getAllWithdrawRequests();
        return ResponseEntity.ok(withdrawRequests);
    }

    /**
     * 审核提现请求
     * @param requestId 请求的ID
     * @param approvedBy 审核管理员
     * @param status 审核状态
     * @return 返回审核结果
     */
    @PutMapping("/approve/{requestId}")
    public ResponseEntity<SysWithdrawRequest> approveWithdrawRequest(
            @PathVariable Long requestId,
            @RequestParam String approvedBy,
            @RequestParam String status) {
        SysWithdrawRequest approvedRequest = sysWithdrawRequestService.approveWithdrawRequest(requestId, approvedBy, status);
        return ResponseEntity.ok(approvedRequest);
    }
}
