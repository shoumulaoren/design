package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 类的静态内部类（线程安全） 懒汉模式
 * @date 2021/6/12 18:52
 */

public class Singleton_05 {
    private static class SingletoHolder{
        private static Singleton_05 instance=new Singleton_05();
    }

    public Singleton_05() {
    }
    public static Singleton_05 getInstance(){
        return SingletoHolder.instance;
    }
}
