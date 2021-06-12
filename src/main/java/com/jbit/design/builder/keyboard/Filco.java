package com.jbit.design.builder.keyboard;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:13
 */

public class Filco implements Mater {
    @Override
    public String scene() {
        return "键盘";
    }

    @Override
    public String brand() {
        return "斐尔可";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1699);
    }

    @Override
    public String description() {
        return "新一代斐尔可键盘键盘";
    }
}
