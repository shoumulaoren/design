package com.jbit.design.command;

import com.jbit.design.command.cook.impl.GuangDongCook;
import com.jbit.design.command.cook.impl.HuNanCook;
import com.jbit.design.command.cook.impl.JiangSuCook;
import com.jbit.design.command.cook.impl.ShangDongCook;
import com.jbit.design.command.cuisine.ICuisine;
import com.jbit.design.command.cuisine.impl.GuangDongCuisine;
import com.jbit.design.command.cuisine.impl.HuNanCuisine;
import com.jbit.design.command.cuisine.impl.JiangSuCuisine;
import com.jbit.design.command.cuisine.impl.ShangDongCuisine;
import org.junit.Test;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 17:02
 */

public class CommandTest {
    @Test
    public void test(){
        ICuisine guangDongCuisine=new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine=new JiangSuCuisine(new JiangSuCook());
        ShangDongCuisine shangDongCuisine=new ShangDongCuisine(new ShangDongCook());
        HuNanCuisine huNanCuisine=new HuNanCuisine(new HuNanCook());
        //点单
        XiaoEr xiaoEr=new XiaoEr();
        xiaoEr.order(guangDongCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shangDongCuisine);
        xiaoEr.order(huNanCuisine);
        //下单
        xiaoEr.placeOrder();

    }
}
