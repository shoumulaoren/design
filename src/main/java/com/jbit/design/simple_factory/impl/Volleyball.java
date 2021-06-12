package com.jbit.design.simple_factory.impl;

import com.jbit.design.simple_factory.Ball;
import com.jbit.design.simple_factory.IBall;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 12:26
 */

public class Volleyball extends Ball implements IBall {
    private Logger log= Logger.getLogger(Volleyball.class.getName());
    @Override
    public void say() {
        log.info("我是排球");
    }

    @Override
    public void guess() {
        log.info("我猜这是一个排球");
    }


}
