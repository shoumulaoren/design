package com.jbit.design.proxy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 14:18
 */

public class ProxyTest {

    private Logger log= Logger.getLogger(ProxyTest.class.getName());
    @Test
    public void test(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao=beanFactory.getBean("userDao",IUserDao.class);
        String res=userDao.queryUserInfo("100001");
        log.info("测试结果："+res);
    }


}
