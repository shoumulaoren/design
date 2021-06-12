package com.jbit.design.builder;

import com.jbit.design.builder.headset.HuaWei;
import com.jbit.design.builder.headset.Sony;
import com.jbit.design.builder.keyboard.Cherry;
import com.jbit.design.builder.keyboard.Filco;
import com.jbit.design.builder.mouse.Lenovo;
import com.jbit.design.builder.mouse.Logitech;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:34
 */

public class Builder {
    public IMenu levelOne() {
        return new MenuImpl("电竞套装")
                .appendHeadSet(new Sony())
                .appendKeyBoard(new Filco())
                .appendMouse(new Logitech());

    }

    public IMenu levelTwo(){
        return new MenuImpl("商务办公套装")
                .appendHeadSet(new HuaWei())
                .appendMouse(new Lenovo())
                .appendKeyBoard(new Cherry());
    }

}
