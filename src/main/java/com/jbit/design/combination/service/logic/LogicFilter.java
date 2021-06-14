package com.jbit.design.combination.service.logic;

import com.jbit.design.combination.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author 32621
 * @description 树节点逻辑过滤器接口
 * @date 2021/6/13 20:48
 */
public interface LogicFilter {
    /**
     * 逻辑决策其
     * @param matterValue 决策值
     * @param treeNodeLinkListInfoList 决策节点
     * @return 下一个节点ID
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkListInfoList);

    /**
     *  获取决策值方法
     * @param treeId 树节点id
     * @param userId 用户id
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);
}
