package com.jbit.design.combination.service.engine.impl;

import com.jbit.design.combination.model.aggregates.TreeRich;
import com.jbit.design.combination.model.vo.EngineResult;
import com.jbit.design.combination.model.vo.TreeNode;
import com.jbit.design.combination.service.engine.EngineBase;

import java.util.Map;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 21:44
 */

public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        //决策流程
        TreeNode treeNode=engineDecisionMaker(treeRich,treeId,userId,decisionMatter);
        //决策结果
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());


    }
}
