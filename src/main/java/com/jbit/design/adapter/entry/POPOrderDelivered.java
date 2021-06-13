package com.jbit.design.adapter.entry;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:12
 */
@Data
public class POPOrderDelivered {
    /**
     * 用户id
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 商品编号
     */
    private Date sku;
    /**
     * 商品名称
     */
    private Date skuName;
    /**
     * 商品金额
     */
    private BigDecimal decimal;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
