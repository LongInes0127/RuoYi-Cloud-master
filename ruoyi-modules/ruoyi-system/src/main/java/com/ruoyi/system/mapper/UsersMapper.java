package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    Users selectByUsername(String username);
    Users selectById(Long id);
}
