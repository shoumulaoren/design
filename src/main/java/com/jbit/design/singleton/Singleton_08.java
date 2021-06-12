package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 枚举单例（线程安全）
 * @date 2021/6/12 19:03
 */

public enum Singleton_08 {
    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

}
