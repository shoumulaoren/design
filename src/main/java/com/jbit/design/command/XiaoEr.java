package com.jbit.design.command;

import com.jbit.design.command.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description 调用者 店小二
 * @date 2021/6/14 16:50
 */

public class XiaoEr {
    private Logger log= Logger.getLogger(XiaoEr.class.getName());
    private List<ICuisine> cuisineList=new ArrayList<>();
    public void order(ICuisine cuisine){
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder(){
        for (ICuisine cuisine: cuisineList){
            cuisine.cook();
        }
    }
}
