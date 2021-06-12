package com.jbit.design.simple_factory.impl;

import com.jbit.design.simple_factory.Ball;
import com.jbit.design.simple_factory.IBall;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 12:23
 */

public class Basketball extends Ball implements IBall {
    private Logger log= Logger.getLogger(Basketball.class.getName());
    @Override
    public void say() {
        log.info("我是篮球");
    }


    @Override
    public void guess() {
        log.info("我猜这是一个篮球");
    }
}
