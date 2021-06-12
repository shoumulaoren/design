package com.jbit.design.prototype;

import org.junit.Test;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 17:18
 */

public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        QuestionBankController controller=new QuestionBankController();
        System.out.println(controller.createPaper("小航","001"));
        System.out.println(controller.createPaper("小明","002"));
        System.out.println(controller.createPaper("小美","003"));

    }
}
