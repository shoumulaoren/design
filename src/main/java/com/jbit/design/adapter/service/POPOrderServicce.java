package com.jbit.design.adapter.service;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:18
 */

public class POPOrderServicce {
    private Logger log= Logger.getLogger(POPOrderServicce.class.getName());

    public boolean isFirstOrder(String uId){
        log.info("POP商家，查询用户的订单是否为首单："+uId);
        return true;
    }
}
