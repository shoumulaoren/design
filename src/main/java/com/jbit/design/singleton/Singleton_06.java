package com.jbit.design.singleton;

/**
 * @author 32621
 * @description 双重锁校验（线程安全） 双检锁
 * @date 2021/6/12 18:55
 */

public class Singleton_06 {
    private static volatile Singleton_06 instance;

    public Singleton_06() {
    }
    public static Singleton_06 getInstance(){
        if (null!=instance) {
            return instance;
        }
        synchronized (Singleton_06.class){
            if (null==instance) {
                instance=new Singleton_06();
            }
        }
        return instance;
    }

}
