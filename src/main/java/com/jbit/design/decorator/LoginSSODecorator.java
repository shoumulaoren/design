package com.jbit.design.decorator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description 装饰角色逻辑实现
 * @date 2021/6/14 10:16
 */

public class LoginSSODecorator extends SSODecorator{
    private Logger log= Logger.getLogger(LoginSSODecorator.class.getName());
    private static Map<String,String> authMap=new ConcurrentHashMap<>();
    static{
        authMap.put("huahua","queryUserInfo");
        authMap.put("doudou","queryUserInfo");
    }
    public LoginSSODecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success=super.preHandle(request, response, handler);
        if (!success) {
            return false;
        }
        String userId=request.substring(8);
        String method=authMap.get(userId);
        log.info("模拟单点登录方法访问拦截校验："+",userId->"+userId+",method->"+method);
        return "queryUserInfo".equals(method);
    }
}
