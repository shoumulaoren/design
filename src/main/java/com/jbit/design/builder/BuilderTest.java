package com.jbit.design.builder;

import org.junit.Test;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:32
 */

public class BuilderTest {
    @Test
    public void test(){
       Builder builder=new Builder();
        System.out.println(builder.levelOne().getDetail());

       System.out.println(builder.levelTwo().getDetail());

    }
}
