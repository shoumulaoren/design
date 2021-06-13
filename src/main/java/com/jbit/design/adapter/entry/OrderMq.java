package com.jbit.design.adapter.entry;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:11
 */
@Data
public class OrderMq {
    /**id
     * 用户
     */
    private String uid;
    /**
     * 商品编号
     */
    private String sku;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;

    @Override
    public String toString() {
          return JSON.toJSONString(this);
    }
}
