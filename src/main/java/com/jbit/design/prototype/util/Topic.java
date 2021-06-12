package com.jbit.design.prototype.util;

import lombok.Data;

import java.util.Map;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 16:24
 */
@Data
public class Topic {
    private Map<String,String> option;
    private String key;

    public Topic(Map<String,String> option,String key){
        this.key=key;
        this.option=option;
    }
}
