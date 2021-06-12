package com.jbit.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 32621
 * @description CAS "AtomicReference" (线程安全）
 * @date 2021/6/12 18:59
 */

public class Singleton_07 {

    private static final AtomicReference<Singleton_07> INSTANCE=new AtomicReference<>();
    private static Singleton_07 instance;

    public Singleton_07() {
    }
    public static final Singleton_07 getInstance(){
        for (;;){
            Singleton_07 instance=INSTANCE.get();
            if (null!=instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_07());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_07.getInstance());
        System.out.println(Singleton_07.getInstance());
    }
}
