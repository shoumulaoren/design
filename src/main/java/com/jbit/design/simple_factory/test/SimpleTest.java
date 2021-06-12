package com.jbit.design.simple_factory.test;

import com.jbit.design.simple_factory.Ball;
import com.jbit.design.simple_factory.BallFactory;
import com.jbit.design.simple_factory.IBall;
import com.jbit.design.simple_factory.impl.Basketball;
import com.jbit.design.simple_factory.impl.Foolball;
import com.jbit.design.simple_factory.impl.Volleyball;
import org.junit.Test;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 12:34
 */

public class SimpleTest {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        BallFactory ballFactory=new BallFactory();
        IBall iBall=ballFactory.getIBallByType(1);
        iBall.say();

        IBall iBall1=ballFactory.getIBallByType(2);
        iBall1.say();

        IBall iBall2=ballFactory.getIBallByClazz(Volleyball.class);
        iBall2.say();
    }

    @Test
    public void test01(){
        BallFactory ballFactory=new BallFactory();

        Ball ball=ballFactory.getBall(new Basketball());
        ball.guess();
        ball.give();

        Ball ball1=ballFactory.getBall(new Foolball());
        ball1.guess();
        ball1.give();

        Ball ball2=ballFactory.getBall(new Volleyball());
        ball2.guess();
        ball2.give();

    }
}
