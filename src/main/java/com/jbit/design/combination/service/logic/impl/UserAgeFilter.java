package com.jbit.design.combination.service.logic.impl;

import com.jbit.design.combination.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author 32621
 * @description 年龄节点
 * @date 2021/6/13 21:24
 */

public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }


}
