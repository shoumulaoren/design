package com.jbit.design.decorator;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 10:22
 */

public class SSOInterceptor implements  HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        //模拟获取Cookie
        String ticket=request.substring(1,8);
        //模拟校验
        return  ticket.equals("success");
    }
}
