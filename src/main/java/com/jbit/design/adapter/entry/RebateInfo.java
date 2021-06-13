package com.jbit.design.adapter.entry;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:21
 */
@Data
public class RebateInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 业务id
     */
    private String bizId;
    /**
     * 业务时间
     */
    private Date bizTime;
    /**
     * 业务描述
     */
    private String desc;

    public void setBizTime(String bizTime) {
        this.bizTime =  new Date(Long.parseLong(bizTime));;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
