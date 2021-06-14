package com.jbit.design.command.cook.impl;

import com.jbit.design.command.cook.ICook;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description 苏菜厨师
 * @date 2021/6/14 16:57
 */

public class JiangSuCook implements ICook {
    private Logger log= Logger.getLogger(JiangSuCook.class.getName());
    @Override
    public void doCooking() {
        log.info("江苏厨师，烹饪苏菜");
    }
}
