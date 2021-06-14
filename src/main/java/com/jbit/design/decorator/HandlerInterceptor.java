package com.jbit.design.decorator;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 10:11
 */
public interface HandlerInterceptor {
    boolean preHandle(String request,String response,Object handler);
}
