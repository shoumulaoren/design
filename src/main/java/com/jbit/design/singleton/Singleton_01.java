package com.jbit.design.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 32621
 * @description 静态类的使用
 * @date 2021/6/12 18:44
 */
public class Singleton_01 {
    public static Map<String,String> cache=new ConcurrentHashMap<>();
}
