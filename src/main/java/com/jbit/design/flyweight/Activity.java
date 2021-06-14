package com.jbit.design.flyweight;

import lombok.Data;

import java.util.Date;

/**
 * @author 32621
 * @description 商品活动信息类
 * @date 2021/6/14 13:17
 */
@Data
public class Activity {
    /**
     * 活动ID
     */
    private Long id;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动描述
     */
    private String desc;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date stopTime;
    /**
     * 活动库存
     */
    private Stock stock;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public Stock getStock() {
        return stock;
    }
}
