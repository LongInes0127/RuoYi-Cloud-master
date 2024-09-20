package com.ruoyi.system.service.impl;

import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.api.domain.UserClicks;
import com.ruoyi.system.api.domain.Users;
import com.ruoyi.system.api.dto.CombinedUserData;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.mapper.UserClicksMapper;
import com.ruoyi.system.mapper.UsersMapper;
import com.ruoyi.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2024/9/20 15:59
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private UserClicksMapper userClicksMapper;

	@Override
	public List<CombinedUserData> selectCombinedUserList(SysUser user) {
		List<SysUser> sysUsers = sysUserMapper.selectUserList(user);
		List<CombinedUserData> combinedList = new ArrayList<>();

		for (SysUser sysUser : sysUsers) {
			CombinedUserData combined = new CombinedUserData();
			combined.setSysUser(sysUser);

			// Fetch data from users table
			Users users = usersMapper.selectByUsername(sysUser.getUserName());
			combined.setUsers(users);

			// Fetch data from user_clicks table
			UserClicks userClicks = userClicksMapper.selectByUserId(users.getId());
			combined.setUserClicks(userClicks);

			combinedList.add(combined);
		}

		return combinedList;
	}
}
