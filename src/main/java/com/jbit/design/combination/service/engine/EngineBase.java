package com.jbit.design.combination.service.engine;

import com.jbit.design.combination.model.aggregates.TreeRich;
import com.jbit.design.combination.model.vo.EngineResult;
import com.jbit.design.combination.model.vo.TreeNode;
import com.jbit.design.combination.model.vo.TreeRoot;
import com.jbit.design.combination.service.logic.LogicFilter;

import java.util.Map;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 21:32
 */

public abstract class EngineBase extends EngineConfig implements IEngine {
    private Logger log= Logger.getLogger(EngineBase.class.getName());

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) ;

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String,String> decisionMatter){
        TreeRoot treeRoot=treeRich.getTreeRoot();
        Map<Long,TreeNode> treeNodeMap=treeRich.getTreeNodeMap();
        //规则树根ID
        Long rootNodeId=treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo=treeNodeMap.get(rootNodeId);
        //节点类型【NodeType】；1 叶子 2 果实
        while (treeNodeInfo.getNodeType().equals(1)){
            String ruleKey=treeNodeInfo.getRuleKey();
            LogicFilter logicFilter=logicFilterMap.get(ruleKey);
            String matterValue=logicFilter.matterValue(treeId,userId,decisionMatter);
            Long nextNode=logicFilter.filter(matterValue,treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo=treeNodeMap.get(nextNode);
            log.info("决策树引擎=>"+treeRoot.getTreeName()+",userId->"+userId+",treeId->"+treeId+",treeNode->"+treeNodeInfo.getTreeNodeId()+",ruleKey->"+ruleKey+",matterValue->"+matterValue);
        }

        return treeNodeInfo;
    }
}
