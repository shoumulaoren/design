package com.jbit.design.combination.model.aggregates;

import com.jbit.design.combination.model.vo.TreeNode;
import com.jbit.design.combination.model.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * @author 32621
 * @description 规则树聚合
 * @date 2021/6/13 20:46
 */
@Data
public class TreeRich {
    /**
     * 树根信息
     */
    private TreeRoot treeRoot;

    /**
     * 树节点ID->子节点
     */
    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot,Map<Long, TreeNode> treeNodeMap){
        this.treeNodeMap=treeNodeMap;
        this.treeRoot=treeRoot;
    }
}
