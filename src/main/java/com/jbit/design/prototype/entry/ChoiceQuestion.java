package com.jbit.design.prototype.entry;

import lombok.Data;

import java.util.Map;

/**
 * @author 32621
 * @description 选择题类
 * @date 2021/6/12 16:34
 */
@Data
public class ChoiceQuestion {
    /**
     * 题目名称
     */
    private String name;
    /**
     * 题目选项 ABCD
     */
    private Map<String,String> option;
    /**
     * 题目答案 B
     */
    private String key;

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
