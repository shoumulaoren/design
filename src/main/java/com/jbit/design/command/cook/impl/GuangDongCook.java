package com.jbit.design.command.cook.impl;

import com.jbit.design.command.cook.ICook;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description 粤菜厨师
 * @date 2021/6/14 16:57
 */

public class GuangDongCook implements ICook {
    private Logger log= Logger.getLogger(GuangDongCook.class.getName());
    @Override
    public void doCooking() {
        log.info("广东厨师，烹饪粤菜");
    }
}
