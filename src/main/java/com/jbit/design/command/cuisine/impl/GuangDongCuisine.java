package com.jbit.design.command.cuisine.impl;

import com.jbit.design.command.cook.ICook;
import com.jbit.design.command.cuisine.ICuisine;

/**
 * @author 32621
 * @description 广东菜（粤菜）
 * @date 2021/6/14 16:51
 */

public class GuangDongCuisine implements ICuisine {
    private ICook cook;
    @Override
    public void cook() {
        cook.doCooking();
    }

    public GuangDongCuisine(ICook cook) {
        this.cook = cook;
    }
}
