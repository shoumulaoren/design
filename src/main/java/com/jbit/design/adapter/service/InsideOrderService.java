package com.jbit.design.adapter.service;

import com.jbit.design.adapter.entry.OrderMq;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 21:14
 */

public class InsideOrderService implements  OrderAdapterService{
    private OrderService orderService=new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId)<=1;
    }
}
