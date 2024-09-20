package com.ruoyi.system.api.domain;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/20 15:54
 */
public class Users {
	private Long id;
	private String username;
	private String password;
	private String phoneNumber;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Boolean isVerified;
	private String verificationCode;
	private Integer inviteCodeStatus;
	private String inviteCode;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getVerified() {
		return isVerified;
	}

	public void setVerified(Boolean verified) {
		isVerified = verified;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public Integer getInviteCodeStatus() {
		return inviteCodeStatus;
	}

	public void setInviteCodeStatus(Integer inviteCodeStatus) {
		this.inviteCodeStatus = inviteCodeStatus;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
}
