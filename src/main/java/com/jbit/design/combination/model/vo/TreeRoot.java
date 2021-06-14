package com.jbit.design.combination.model.vo;

import lombok.Data;

/**
 * @author 32621
 * @description 树根信息
 * @date 2021/6/13 21:08
 */
@Data
public class TreeRoot {
    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;
}
