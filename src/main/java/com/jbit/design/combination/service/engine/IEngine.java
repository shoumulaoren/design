package com.jbit.design.combination.service.engine;

import com.jbit.design.combination.model.aggregates.TreeRich;
import com.jbit.design.combination.model.vo.EngineResult;

import java.util.Map;

/**
 * @author 32621
 * @description 决策引擎接口定义
 * @date 2021/6/13 21:27
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich,final Map<String,String> decisionMatter);
}
