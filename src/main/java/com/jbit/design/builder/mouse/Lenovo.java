package com.jbit.design.builder.mouse;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:07
 */

public class Lenovo implements Mater {
    @Override
    public String scene() {
        return "鼠标";
    }

    @Override
    public String brand() {
        return "联想";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(100);
    }

    @Override
    public String description() {
        return "联想旗下的一款无线蓝牙静音鼠标";
    }
}
