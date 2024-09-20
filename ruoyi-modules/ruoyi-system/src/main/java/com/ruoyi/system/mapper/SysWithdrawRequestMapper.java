package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysWithdrawRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysWithdrawRequestMapper {

    /**
     * 插入新的提现请求
     *
     * @param withdrawRequest 提现请求对象
     * @return 影响的行数
     */
    int insertWithdrawRequest(SysWithdrawRequest withdrawRequest);

    /**
     * 查询所有提现请求
     *
     * @return 提现请求列表
     */
    List<SysWithdrawRequest> getAllWithdrawRequests();

    /**
     * 根据 ID 查询提现请求
     *
     * @param requestId 提现请求ID
     * @return 提现请求对象
     */
    SysWithdrawRequest findById(Long requestId);

    /**
     * 更新提现请求的审核状态
     *
     * @param withdrawRequest 提现请求对象
     * @return 影响的行数
     */
    int updateWithdrawRequest(SysWithdrawRequest withdrawRequest);
}
