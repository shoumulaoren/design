package com.jbit.design.prototype;

import com.jbit.design.prototype.entry.AnswerQuestion;
import com.jbit.design.prototype.entry.ChoiceQuestion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 16:59
 */

public class QuestionBankController{
    private QuestionBank questionBank=new QuestionBank();
    public QuestionBankController(){
        Map<String,String> map1=new HashMap<>();
        map1.put("A","JAVA2 EE");
        map1.put("B","JAVA2 Card");
        map1.put("C","JAVA2 ME");
        map1.put("D","JAVA2 HE");
        map1.put("E","JAVA2 SE");

        Map<String,String> map2=new HashMap<>();
        map2.put("A","JAVA程序的main方法必须写在类里面");
        map2.put("B","JAVA程序中可以有多个main方法");
        map2.put("C","JAVA程序中类名必须和文件名一样");
        map2.put("D","JAVA是世界第一语言");

        Map<String,String> map3=new HashMap<>();
        map3.put("A","变量由字母，下划线，数字随意组成");
        map3.put("B","变量不能以数字作为开头");
        map3.put("C","A和a在JAVA中是同一个变量");
        map3.put("D","不同类型的变量，可以起相同的名字");

        Map<String,String> map4=new HashMap<>();
        map4.put("A","STRING");
        map4.put("B","x3x");
        map4.put("C","void");
        map4.put("D","def$f");

        Map<String,String> map5=new HashMap<>();
        map5.put("A","31");
        map5.put("B","0");
        map5.put("C","1");
        map5.put("D","2");

        questionBank.append(new ChoiceQuestion("JAVA所定义的版本中不包括",map1,"D"))
                .append(new ChoiceQuestion("变量命名规范说法正确的是",map3,"B"))
                .append(new ChoiceQuestion("下列说法正确的是",map2,"A"))
                .append(new ChoiceQuestion("以下()不是合法的标识符",map4,"C"))
                .append(new ChoiceQuestion("表达式（11+3*8）/4%3的值是",map5,"D"))
                .append(new AnswerQuestion("小红马和小黑马的小马有几条腿","4条腿"))
                .append(new AnswerQuestion("铁棒打头疼还是木棒打头疼","头最疼"))
                .append(new AnswerQuestion("什么床不能睡觉","牙床"))
                .append(new AnswerQuestion("为什么好马不吃回头草","后面的草没了"));

    }

    public String createPaper(String candidate,String number) throws CloneNotSupportedException {
        QuestionBank questionBankClone= (QuestionBank) questionBank.clone();
        questionBankClone.setCandidate(candidate);
        questionBankClone.setNumber(number);
        return questionBankClone.toString();
    }
}
