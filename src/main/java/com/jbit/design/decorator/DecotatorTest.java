package com.jbit.design.decorator;

import org.junit.Test;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 10:21
 */

public class DecotatorTest {
    @Test
    public void test(){
        LoginSSODecorator ssoDecorator=new LoginSSODecorator(new SSOInterceptor());
        String request="1successhuahua";
        boolean success=ssoDecorator.preHandle(request,"ewcdqwt40liuliu","t");
        System.out.println("登录校验："+request+(success?"放行":"拦截"));
    }
}
