package com.jbit.design.combination.model.vo;

/**
 * @author 32621
 * @description 决策结果
 * @date 2021/6/13 21:13
 */

public class EngineResult {
    /**
     * 执行结果
     */
    private boolean isSuccess;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 果实节点ID
     */
    private Long nodeId;

    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    @Override
    public String toString() {
        return "EngineResult{" +
                "isSuccess=" + isSuccess +
                ", userId='" + userId + '\'' +
                ", treeId=" + treeId +
                ", nodeId=" + nodeId +
                ", nodeValue='" + nodeValue + '\'' +
                '}';
    }
}
