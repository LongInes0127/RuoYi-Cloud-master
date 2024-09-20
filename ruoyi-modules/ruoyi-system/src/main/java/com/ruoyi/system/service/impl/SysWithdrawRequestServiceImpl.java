package com.ruoyi.system.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipayFundTransUniTransferResponse;
import com.ruoyi.system.domain.SysWithdrawRequest;
import com.ruoyi.system.mapper.SysWithdrawRequestMapper;
import com.ruoyi.system.service.AlipayTransferService;
import com.ruoyi.system.service.SysWithdrawRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
public class SysWithdrawRequestServiceImpl implements SysWithdrawRequestService {

    private static final Logger logger = LoggerFactory.getLogger(SysWithdrawRequestServiceImpl.class);

    @Autowired
    private SysWithdrawRequestMapper withdrawRequestMapper;

    @Autowired
    private AlipayTransferService alipayTransferService;  // 创建支付宝转账服务

/*    @Override
    public SysWithdrawRequest createWithdrawRequest(SysWithdrawRequest withdrawRequest) {
        // 将当前时间格式化为 MySQL 支持的 TIMESTAMP 格式
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

        withdrawRequest.setRequestTime(dateTime);  // 设置申请时间为当前时间
        withdrawRequest.setStatus("pending");      // 设置状态为 pending

        withdrawRequestMapper.insertWithdrawRequest(withdrawRequest);  // 插入数据库
        return withdrawRequest; // 返回带有生成的 ID 的对象
    }*/

    /**
     * 创建提现请求并执行提现操作
     *
     * @param withdrawRequest 提现请求对象
     * @return 更新后的提现请求对象
     */
    @Override
    @Transactional
    public SysWithdrawRequest createWithdrawRequest(SysWithdrawRequest withdrawRequest) {
        // 设置申请时间为当前时间
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        withdrawRequest.setRequestTime(dateTime);

        // 设置初始状态为 "pending"
        withdrawRequest.setStatus("pending");

        // 生成唯一的订单号
        String outBizNo = "TXN" + UUID.randomUUID().toString().replace("-", "");
        withdrawRequest.setOutBizNo(outBizNo);

        // 插入提现请求到数据库
        withdrawRequestMapper.insertWithdrawRequest(withdrawRequest);
        logger.info("提现请求已创建，ID: {}, 订单号: {}", withdrawRequest.getRequestId(), outBizNo);

        try {
            // 执行支付宝转账
            AlipayFundTransUniTransferResponse response = alipayTransferService.transferFunds(
                    String.valueOf(withdrawRequest.getAmount()),      // 转账金额，需转换为 String 类型
                    "提现订单",                                        // 订单标题
                    "ALIPAY_LOGON_ID",                                 // 收款方身份类型
                    withdrawRequest.getAccount(),                      // 收款方身份标识（手机号或邮箱）
                    withdrawRequest.getUsername(),                     // 收款方真实姓名
                    withdrawRequest.getRemarks()                       // 转账备注
            );

            if (response.isSuccess()) {
                // 转账成功，更新状态为 "success"
                withdrawRequest.setStatus("success");
                withdrawRequest.setResponseBody(response.getBody());
                logger.info("提现成功，订单号: {}", outBizNo);
            } else {
                // 转账失败，更新状态为 "failed" 并记录失败原因
                withdrawRequest.setStatus("failed");
                withdrawRequest.setFailureReason(response.getSubMsg());
                logger.error("提现失败，订单号: {}, 原因: {}", outBizNo, response.getSubMsg());
            }

        } catch (AlipayApiException e) {
            // 处理 AlipayApiException 异常，更新状态为 "failed" 并记录异常信息
            withdrawRequest.setStatus("failed");
            withdrawRequest.setFailureReason(e.getMessage());
            logger.error("调用支付宝转账API时发生异常，订单号: {}", outBizNo, e);
        }

        // 更新提现请求的状态和相关信息到数据库
        withdrawRequestMapper.updateWithdrawRequest(withdrawRequest);
        logger.info("提现请求已更新，ID: {}, 状态: {}", withdrawRequest.getRequestId(), withdrawRequest.getStatus());

        return withdrawRequest;
    }

    @Override
    public List<SysWithdrawRequest> getAllWithdrawRequests() {
        return withdrawRequestMapper.getAllWithdrawRequests(); // 查询所有的提现请求
    }

    @Override
    public SysWithdrawRequest approveWithdrawRequest(Long requestId, String approvedBy, String status) {
        SysWithdrawRequest request = withdrawRequestMapper.findById(requestId);
        if (request != null) {
            request.setApprovedBy(approvedBy);  // 设置审核管理员
            request.setStatus(status);  // 设置审核状态
            request.setApprovalTime(Instant.now().getEpochSecond());  // 设置审核时间
            withdrawRequestMapper.updateWithdrawRequest(request);  // 更新请求状态
            return request;
        }
        return null; // 如果请求不存在，返回null
    }
}
