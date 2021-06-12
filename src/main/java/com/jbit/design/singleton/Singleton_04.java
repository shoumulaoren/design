package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 饿汉模式（线程安全）
 * @date 2021/6/12 18:49
 */

public class Singleton_04 {
    private static Singleton_04 instance=new Singleton_04();

    public Singleton_04() {

    }
    public static Singleton_04 getInstance(){
        return instance;
    }
}
