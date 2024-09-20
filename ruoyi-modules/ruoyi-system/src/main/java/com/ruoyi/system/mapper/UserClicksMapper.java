package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.UserClicks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserClicksMapper {
    UserClicks selectByUserId(Long userId);
}
