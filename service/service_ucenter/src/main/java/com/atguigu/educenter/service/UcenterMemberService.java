package com.atguigu.educenter.service;

import com.atguigu.educenter.entity.UcenterMember;
import com.atguigu.educenter.entity.vo.RegisterVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author renyi
 * @since 2023-05-09
 */
public interface UcenterMemberService extends IService<UcenterMember> {

    /**
     * 登录的方法
     *
     * @param member UcenterMember
     * @return token字符
     */
    String login(UcenterMember member);

    /**
     * 注册的方法
     *
     * @param registerVo RegisterVo
     */
    void register(RegisterVo registerVo);

    /**
     * 根据openid判断
     */
    UcenterMember getOpenIdMember(String openid);

    /**
     * 统计当日注册人数
     * @param day 日期
     * @return 注册人数
     */
    Integer countRegisterDay(String day);
}
