package com.jbit.design.adapter;

import com.alibaba.fastjson.JSON;
import com.jbit.design.adapter.entry.RebateInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:20
 */

public class MQAdapter {
    public static RebateInfo filter(String strJson,Map<String,String> link) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return filter(JSON.parseObject(strJson,Map.class),link);
    }

    public static RebateInfo filter(Map obj, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo=new RebateInfo();
        for (String key : link.keySet()){
            Object val=obj.get(link.get(key));
            RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()+
                    key.substring(1),String.class).invoke(rebateInfo,val.toString());
        }
        return rebateInfo;
    }
}
