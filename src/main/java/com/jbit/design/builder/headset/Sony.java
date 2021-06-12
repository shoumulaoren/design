package com.jbit.design.builder.headset;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 14:59
 */

public class Sony implements Mater {
    @Override
    public String scene() {
        return "耳机";
    }

    @Override
    public String brand() {
        return "索尼";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1500);
    }

    @Override
    public String description() {
        return "这是一款索尼旗舰耳机:XH-G001";
    }
}
