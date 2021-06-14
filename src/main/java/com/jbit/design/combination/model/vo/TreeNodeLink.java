package com.jbit.design.combination.model.vo;

import lombok.Data;

/**
 * @author 32621
 * @description 规则树线信息
 * @date 2021/6/13 20:55
 */
@Data
public class TreeNodeLink {
    /**
     * 节点From
     */
    private Long nodeIdFrom;

    /**
      * 节点To
     */
    private Long nodeIdTo;

    /**
     * 限定类型 1:=;2:>;3:<;4:=;5:<=;6:enum[枚举范围]
     */
    private Integer ruleLimitType;

    /**
     * 限定值
     */
    private String ruleLimitValue;

}
