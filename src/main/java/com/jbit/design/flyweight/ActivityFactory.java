package com.jbit.design.flyweight;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 32621
 * @description 享元工厂
 * @date 2021/6/14 13:21
 */

public class ActivityFactory {
    static Map<Long,Activity> activityMap=new HashMap<>();

    public static Activity getActivity(Long id){
        Activity activity=activityMap.get(id);
        if (null==activity) {
            //模拟实际业务应用从接口获取活动信息
            activity=new Activity();
            activity.setDesc("图书优惠券分享激励活动第二期");
            activity.setId(10001L);
            activity.setName("图书嗨了");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }
}
