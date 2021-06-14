package com.jbit.design.command.cook.impl;

import com.jbit.design.command.cook.ICook;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description 湘菜厨师
 * @date 2021/6/14 16:57
 */

public class HuNanCook implements ICook {
    private Logger log= Logger.getLogger(HuNanCook.class.getName());
    @Override
    public void doCooking() {
        log.info("湖南厨师，烹饪湘菜");
    }
}
