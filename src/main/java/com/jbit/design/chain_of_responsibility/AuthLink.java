package com.jbit.design.chain_of_responsibility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description 链路抽象类
 * @date 2021/6/14 15:06
 */

public abstract class AuthLink {
    private Logger log= Logger.getLogger(AuthLink.class.getName());
    //时间格式化
    protected SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //级别人员ID
    protected String levelUserId;
    //级别人员姓名
    protected String levelUserName;
    //责任链
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next(){
        return next;
    }

    public AuthLink appendNext(AuthLink next){
        this.next=next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
