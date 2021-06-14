package com.jbit.design.command.cuisine.impl;

import com.jbit.design.command.cook.ICook;
import com.jbit.design.command.cuisine.ICuisine;

/**
 * @author 32621
 * @description 山东菜（鲁菜）
 * @date 2021/6/14 16:51
 */

public class ShangDongCuisine implements ICuisine {
    private ICook cook;
    @Override
    public void cook() {
        cook.doCooking();
    }

    public ShangDongCuisine(ICook cook) {
        this.cook = cook;
    }
}
