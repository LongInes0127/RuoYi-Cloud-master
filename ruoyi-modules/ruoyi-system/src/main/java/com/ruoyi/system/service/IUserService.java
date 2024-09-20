package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.api.dto.CombinedUserData;

import java.util.List;

public interface IUserService {
    List<CombinedUserData> selectCombinedUserList(SysUser user);
}
