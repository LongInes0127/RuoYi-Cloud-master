package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SysAdData {
	private Long id;
	private LocalDate date;
	private Long adRequestPv;
	private Long exposurePv;
	private Long clickPv;
	private BigDecimal clickRate;
	private BigDecimal ecpm;
	private BigDecimal adRevenue;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getAdRequestPv() {
		return adRequestPv;
	}

	public void setAdRequestPv(Long adRequestPv) {
		this.adRequestPv = adRequestPv;
	}

	public Long getExposurePv() {
		return exposurePv;
	}

	public void setExposurePv(Long exposurePv) {
		this.exposurePv = exposurePv;
	}

	public Long getClickPv() {
		return clickPv;
	}

	public void setClickPv(Long clickPv) {
		this.clickPv = clickPv;
	}

	public BigDecimal getClickRate() {
		return clickRate;
	}

	public void setClickRate(BigDecimal clickRate) {
		this.clickRate = clickRate;
	}

	public BigDecimal getEcpm() {
		return ecpm;
	}

	public void setEcpm(BigDecimal ecpm) {
		this.ecpm = ecpm;
	}

	public BigDecimal getAdRevenue() {
		return adRevenue;
	}

	public void setAdRevenue(BigDecimal adRevenue) {
		this.adRevenue = adRevenue;
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
}
