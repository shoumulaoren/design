package com.jbit.design.builder.mouse;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:04
 */

public class Logitech implements Mater {
    @Override
    public String scene() {
        return "鼠标";
    }

    @Override
    public String brand() {
        return "罗技";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(600);
    }

    @Override
    public String description() {
        return "罗技新一代无线电竞鼠标，低延迟";
    }
}
