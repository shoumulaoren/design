package com.jbit.design.prototype.entry;

import lombok.Data;

/**
 * @author 32621
 * @description 问答题类
 * @date 2021/6/12 16:37
 */
@Data
public class AnswerQuestion {
    /**
     * 问题
     */
    private String name;
    /**
     * 答案
     */
    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
