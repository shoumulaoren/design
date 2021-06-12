package com.jbit.design.simple_factory;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 12:48
 */

public abstract class Ball {
    private Logger log= Logger.getLogger(Ball.class.getName());
    public  void give(){
        log.info("我给你一个球");
    }

    public abstract void guess();
}
