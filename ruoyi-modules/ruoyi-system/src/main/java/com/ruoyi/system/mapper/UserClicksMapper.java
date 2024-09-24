package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.UserClicks;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserClicksMapper {
    List<UserClicks> selectByPhoneNumber(String phoneNumber);
}
