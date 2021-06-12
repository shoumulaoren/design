package com.jbit.design.builder;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 14:54
 */

public interface Mater {
    /**
     * 场景
     * @return
     */
    String scene();
    /**
     * 品牌
     */
     String brand();
    /**
     * 价格
     */
     BigDecimal price();
    /**
     * 描述
     */
     String description();
}
