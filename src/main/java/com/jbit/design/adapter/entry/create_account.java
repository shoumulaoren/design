package com.jbit.design.adapter.entry;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:05
 */
@Data
public class create_account {
    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private Date accountDate;
    /**
     * 开户描述
     */
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
