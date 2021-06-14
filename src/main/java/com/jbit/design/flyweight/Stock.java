package com.jbit.design.flyweight;

import lombok.Data;

/**
 * @author 32621
 * @description 商品活动库存信息类
 * @date 2021/6/14 13:19
 */
@Data
public class Stock {
    /**
     * 库存总量
     */
    private int total;
    /**
     * 库存已用
     */
    private int used;

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public int getUsed() {
        return used;
    }
}
