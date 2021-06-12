package com.jbit.design.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 15:18
 */

public class MenuImpl implements IMenu{
    private List<Mater> list=new ArrayList<>();
    private BigDecimal price=BigDecimal.ZERO;
    private String grade;

    public MenuImpl(String grade){
        this.grade=grade;
    }


    @Override
    public IMenu appendHeadSet(Mater mater) {
        list.add(mater);
        price=price.add(mater.price());
        return this;
    }

    @Override
    public IMenu appendKeyBoard(Mater mater) {
        list.add(mater);
        price=price.add(mater.price());
        return this;
    }

    @Override
    public IMenu appendMouse(Mater mater) {
        list.add(mater);
        price=price.add(mater.price());
        return this;
    }

    @Override
    public String getDetail() {
       StringBuffer sb=new StringBuffer();
       sb.append("你选择的是"+this.grade+"\r\n");
        sb.append("总价："+price.setScale(2,BigDecimal.ROUND_HALF_UP)+"元"+"\r\n");
        list.forEach(e->{
            sb.append("种类"+e.scene()+"品牌->"+e.brand()+",单价-->"+e.price()+"元,描述-->"+e.description()+"\r\n");
                }
                );
        return sb.toString();
    }


}
