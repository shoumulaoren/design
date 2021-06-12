package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 懒汉模式（线程不安全）
 * @date 2021/6/12 18:45
 */

public class Singleton_02 {
    private static Singleton_02 instance;

    public Singleton_02() {
    }
    public static Singleton_02 getInstance(){
        if(null!=instance){
            return instance;
        }
        instance=new Singleton_02();
        return instance;
    }
}
