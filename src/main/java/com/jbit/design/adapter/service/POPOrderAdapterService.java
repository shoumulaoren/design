package com.jbit.design.adapter.service;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 21:16
 */

public class POPOrderAdapterService implements OrderAdapterService{
    private POPOrderServicce popOrderServicce=new POPOrderServicce();
    @Override
    public boolean isFirst(String uId) {
        return popOrderServicce.isFirstOrder(uId);
    }
}
