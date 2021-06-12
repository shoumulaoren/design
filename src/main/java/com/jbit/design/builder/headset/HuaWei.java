package com.jbit.design.builder.headset;

import com.jbit.design.builder.Mater;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:02
 */

public class HuaWei implements Mater {
    @Override
    public String scene() {
        return "耳机";
    }

    @Override
    public String brand() {
        return "华为";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1500);
    }

    @Override
    public String description() {
        return "这是华为自研的一款最新降噪耳机：huawei-60s";
    }
}
