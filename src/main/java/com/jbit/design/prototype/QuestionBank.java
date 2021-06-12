package com.jbit.design.prototype;

import com.jbit.design.prototype.entry.AnswerQuestion;
import com.jbit.design.prototype.entry.ChoiceQuestion;
import com.jbit.design.prototype.util.Topic;
import com.jbit.design.prototype.util.TopicRandomUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * @author 题库复制对象类
 * @description
 * @date 2021/6/12 16:31
 */
@Data
public class QuestionBank implements  Cloneable{
    /**
     * 考生
     */
    private String candidate;
    /**
     * 考号
     */
    private String number;

    private ArrayList<ChoiceQuestion> choiceQuestionList=new ArrayList<>();
    private ArrayList<AnswerQuestion> answerQuestionList=new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank= (QuestionBank) super.clone();
        questionBank.choiceQuestionList= (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList= (ArrayList<AnswerQuestion>) answerQuestionList.clone();
       //题目混排
        Collections.shuffle(questionBank.choiceQuestionList);
        //答案混排
        Collections.shuffle(questionBank.answerQuestionList);

        ArrayList<ChoiceQuestion> choiceQuestionList= questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList){
            Topic random= TopicRandomUtil.random(question.getOption(),question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());

        }
        return questionBank;
    }

    @Override
    public String toString(){
        StringBuilder detail=new StringBuilder("考生："+this.getCandidate()+"\r\n"+"考号："+this.getNumber()+
                "\r\n"+"--------------------------\r\n"+
                "一，选择题"+"\r\n\n");
        for (int idx=0;idx<choiceQuestionList.size();idx++){
            detail.append("第").append(idx+1).append("题：")
                    .append(choiceQuestionList.get(idx).getName())
                    .append("\r\n");
            Map<String,String> option=choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()){
                detail.append(key).append(":")
                        .append(option.get(key))
                        .append("\r\n");
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey())
                    .append("\r\n");

        }

        detail.append("二，问答题"+"\r\n");
        for (int idx=0;idx<answerQuestionList.size();idx++){
            detail.append("第").append(idx+1).append("题：")
                    .append(answerQuestionList.get(idx).getName())
                    .append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey())
                    .append("\r\n");
        }
        return detail.toString();
    }

}
