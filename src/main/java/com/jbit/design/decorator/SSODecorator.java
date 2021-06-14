package com.jbit.design.decorator;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 10:12
 */

public abstract class SSODecorator implements  HandlerInterceptor{
    private HandlerInterceptor handlerInterceptor;
    private SSODecorator(){}
    public SSODecorator(HandlerInterceptor handlerInterceptor){
        this.handlerInterceptor=handlerInterceptor;
    }


    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request,response,handler);
    }
}
