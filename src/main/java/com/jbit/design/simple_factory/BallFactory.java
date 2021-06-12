package com.jbit.design.simple_factory;

import com.jbit.design.simple_factory.impl.Basketball;
import com.jbit.design.simple_factory.impl.Foolball;
import com.jbit.design.simple_factory.impl.Volleyball;

/**
 * @author 32621
 * @description 球类工厂
 * @date 2021/6/12 12:18
 */

public class BallFactory {
    public IBall getIBallByType(Integer type){
        if (null==type) {
            return null;
        }else if(type.equals(1)){
            return new Basketball();
        }else if(type.equals(2)){
            return new Foolball();
        }else if(type.equals(3)){
            return new Volleyball();
        }else{
            throw new IllegalArgumentException("非法参数");
        }

    }

    public IBall getIBallByClazz(Class<? extends IBall>  clazz ) throws IllegalAccessException, InstantiationException{
            if(null==clazz){
                return null;
            }
            return clazz.newInstance();
    }

    public Ball getBall(Ball ball){
        if(null==ball){
            return null;
        }else if(ball instanceof Basketball){
            return new Basketball();
        }else if(ball instanceof Foolball){
            return new Foolball();
        }else if(ball instanceof Volleyball){
            return new Volleyball();
        }else {
            throw new IllegalArgumentException("非法参数");
        }
    }

}
