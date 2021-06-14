package com.jbit.design.chain_of_responsibility;

import com.jbit.design.adapter.service.OrderAdapterService;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 32621
 * @description 模拟审批服务
 * @date 2021/6/14 15:22
 */

public class AuthService {
    private static Map<String, Date> authMap=new ConcurrentHashMap<>();

    public static Date queryAuthInfo(String uId, String orderId){
        return authMap.get(uId.concat(orderId));
    }
    public static void auth(String uId,String orderId){
        authMap.put(uId.concat(orderId),new Date());
    }
}
