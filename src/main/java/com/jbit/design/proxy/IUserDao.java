package com.jbit.design.proxy;

import com.jbit.design.proxy.agent.Select;

/**
 * @author 32621
 * @description DAO层接口
 * @date 2021/6/14 14:13
 */
public interface IUserDao {
    @Select("select userName from user where id=#{uId}")
    String queryUserInfo(String uId);
}
