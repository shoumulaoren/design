package com.jbit.design.adapter.service;


import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:15
 */

public class OrderService {
    private Logger log= Logger.getLogger(OrderService.class.getName());

    public long queryUserOrderCount(String userId){
        log.info("内部商家，查询用户的下单数量："+userId);
        return 10L;
    }
}
