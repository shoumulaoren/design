package com.jbit.design.flyweight;

import com.jbit.design.flyweight.util.RedisUtils;

/**
 * @author 32621
 * @description 活动控制类
 * @date 2021/6/14 13:34
 */

public class ActivityController {
    private RedisUtils redisUtils=new RedisUtils();
    public Activity queryActivityInfo(Long id){
        Activity activity=ActivityFactory.getActivity(id);
        //模拟从redis中获取商品库存变化信息
        Stock stock=new Stock(1000,redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
