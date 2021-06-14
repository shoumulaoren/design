package com.jbit.design.flyweight.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 13:17
 */

public class RedisUtils {
    private ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(1);
    private AtomicInteger stock=new AtomicInteger();
    public RedisUtils(){
        scheduledExecutorService.scheduleAtFixedRate(()->{
            //模拟库存消耗
            stock.addAndGet(1);
        },0,100000, TimeUnit.MICROSECONDS);
    }

    public int getStockUsed(){
        return stock.get();
    }
}
