package com.ruoyi.system.api.dto;

import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.api.domain.UserClicks;
import com.ruoyi.system.api.domain.Users;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/20 15:58
 */
public class CombinedUserData {

	private SysUser sysUser;
	private Users users;
	private UserClicks userClicks;

	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public UserClicks getUserClicks() {
		return userClicks;
	}

	public void setUserClicks(UserClicks userClicks) {
		this.userClicks = userClicks;
	}
}
