package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 懒汉模式（线程安全）
 * @date 2021/6/12 18:47
 */

public class Singleton_03 {
    private static Singleton_03 instance;

    public Singleton_03() {
    }
    public static  synchronized Singleton_03 getInstance(){
        if (null!=instance) {
            return instance;
        }
        instance=new Singleton_03();
        return instance;
    }
}
