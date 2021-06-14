package com.jbit.design.command.cook.impl;

import com.jbit.design.command.cook.ICook;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description 鲁菜厨师
 * @date 2021/6/14 16:57
 */

public class ShangDongCook implements ICook {
    private Logger log= Logger.getLogger(ShangDongCook.class.getName());
    @Override
    public void doCooking() {
        log.info("山东厨师，烹饪鲁菜");
    }
}
