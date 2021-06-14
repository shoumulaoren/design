package com.jbit.design.combination.service.logic;

import com.jbit.design.combination.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author 32621
 * @description 决策抽象类提供基础服务
 * @date 2021/6/13 21:15
 */

public abstract class BaseLogic implements LogicFilter{
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkListInfoList) {
        for (TreeNodeLink nodeLine : treeNodeLinkListInfoList){
            if (decisionLogic(matterValue,nodeLine)) {
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) ;

    private boolean decisionLogic(String matterValue,TreeNodeLink nodeLink){
        switch (nodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue)>Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
