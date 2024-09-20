package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysWithdrawRequest;

import java.util.List;

public interface SysWithdrawRequestService {

    // 创建新的提现请求
    SysWithdrawRequest createWithdrawRequest(SysWithdrawRequest withdrawRequest);

    // 获取所有提现请求
    List<SysWithdrawRequest> getAllWithdrawRequests();

    // 审核提现请求
    SysWithdrawRequest approveWithdrawRequest(Long requestId, String approvedBy, String status);
}
