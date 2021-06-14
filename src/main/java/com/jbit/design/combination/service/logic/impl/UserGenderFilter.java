package com.jbit.design.combination.service.logic.impl;

import com.jbit.design.combination.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 21:26
 */

public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
