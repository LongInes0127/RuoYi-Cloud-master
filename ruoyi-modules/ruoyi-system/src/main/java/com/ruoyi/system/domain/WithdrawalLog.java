package com.ruoyi.system.domain;// WithdrawalLog.java

import java.math.BigDecimal;
import java.util.Date;

public class WithdrawalLog {
	private Long id;
	private String username;
	private String phoneNumber;
	private BigDecimal amount;
	private Date withdrawalTime;
	private String status;
	private String remarks;

	public enum WithdrawalStatus {
		SUCCESS, FAILURE
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getWithdrawalTime() {
		return withdrawalTime;
	}

	public void setWithdrawalTime(Date withdrawalTime) {
		this.withdrawalTime = withdrawalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
