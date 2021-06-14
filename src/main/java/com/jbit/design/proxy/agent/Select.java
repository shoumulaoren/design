package com.jbit.design.proxy.agent;

import java.lang.annotation.*;

/**
 * @author 32621
 * @description 自定义注解
 * @date 2021/6/14 14:01
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    String value() default "";
}
