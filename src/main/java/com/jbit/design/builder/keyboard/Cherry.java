package com.jbit.design.builder.keyboard;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:10
 */

public class Cherry implements Mater {
    @Override
    public String scene() {
        return "键盘";
    }

    @Override
    public String brand() {
        return "樱桃";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2599);
    }

    @Override
    public String description() {
        return "新一代樱桃键盘";
    }
}
