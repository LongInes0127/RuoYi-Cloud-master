package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * 提现申请实体类
 *
 * 作者: 张军
 */
public class SysWithdrawRequest {
	/**
	 * 提现请求ID
	 */
	private Long requestId;

	/**
	 * 用户名称
	 */
	private String username;

	/**
	 * 提现账户
	 */
	private String account;

	/**
	 * 提现金额
	 */
	private Double amount;

	/**
	 * 申请时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime requestTime;

	/**
	 * 提现状态
	 */
	private String status;

	/**
	 * 审核管理员
	 */
	private String approvedBy;

	/**
	 * 审核时间
	 */
	private Long approvalTime;

	/**
	 * 提现备注
	 */
	private String remarks;

	/**
	 * 支付宝订单号
	 */
	private String outBizNo;

	/**
	 * 支付宝响应体
	 */
	private String responseBody;

	/**
	 * 转账失败原因
	 */
	private String failureReason;

	// Getters and Setters
	// ...

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(LocalDateTime requestTime) {
		this.requestTime = requestTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Long getApprovalTime() {
		return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
		this.approvalTime = approvalTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}
}
