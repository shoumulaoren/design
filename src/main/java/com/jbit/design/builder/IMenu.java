package com.jbit.design.builder;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:17
 */

public interface IMenu {
    IMenu appendHeadSet(Mater mater);
    IMenu appendKeyBoard(Mater mater);
    IMenu appendMouse(Mater mater);
    String getDetail();
}
