package com.ruoyi.system.api.domain;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/20 15:56
 */
public class UserClicks {

	private Long id;

	private String phoneNumber;

	private Integer watchedAdsCount;

	private Integer unseenAdsCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getWatchedAdsCount() {
		return watchedAdsCount;
	}

	public void setWatchedAdsCount(Integer watchedAdsCount) {
		this.watchedAdsCount = watchedAdsCount;
	}

	public Integer getUnseenAdsCount() {
		return unseenAdsCount;
	}

	public void setUnseenAdsCount(Integer unseenAdsCount) {
		this.unseenAdsCount = unseenAdsCount;
	}
}
