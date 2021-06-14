package com.jbit.design.chain_of_responsibility.impl;

import com.jbit.design.chain_of_responsibility.AuthInfo;
import com.jbit.design.chain_of_responsibility.AuthLink;
import com.jbit.design.chain_of_responsibility.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 15:17
 */

public class Level1AuthLink extends AuthLink {
    private Date beginDate=f.parse("2020-06-11 00:00:00");
    private Date endDate=f.parse("2020-06-20 23:59:59");

    public Level1AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }



    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date= AuthService.queryAuthInfo(levelUserId,orderId);
        if (null==date) {
            return new AuthInfo("0001"," 单号：",orderId," 状态：待一级负责人审批 ",levelUserName);
        }
        AuthLink next=super.next();
        if (null==next) {
            return new AuthInfo("0000","单号：",orderId," 状态：一级负责人审批完成","时间：",f.format(date)," 审批人：",levelUserName);
        }
        if (authDate.before(beginDate)|| authDate.after(endDate)) {
            return new AuthInfo("0000","单号：",orderId," 状态：一级负责人审批完成","时间：",f.format(date)," 审批人：",levelUserName);
        }
        return next.doAuth(uId,orderId,authDate);
    }
}
