package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
    Users selectByUsername(String username);

    Users selectById(Long id);

    List<Users> selectByPhoneNumber(String phoneNumber);
}
