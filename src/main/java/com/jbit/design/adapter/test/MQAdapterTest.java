package com.jbit.design.adapter.test;

import com.alibaba.fastjson.JSON;
import com.jbit.design.adapter.MQAdapter;
import com.jbit.design.adapter.entry.OrderMq;
import com.jbit.design.adapter.entry.RebateInfo;
import com.jbit.design.adapter.entry.create_account;
import com.jbit.design.adapter.service.InsideOrderService;
import com.jbit.design.adapter.service.OrderAdapterService;
import com.jbit.design.adapter.service.POPOrderAdapterService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 20:30
 */

public class MQAdapterTest {
    @Test
    public void test1(){
        OrderAdapterService popOrderAdapterService=new POPOrderAdapterService();
        System.out.println("判断首单，接口适配（POP）"+popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService =new InsideOrderService();
        System.out.println("判断首单，接口适配（自营）"+insideOrderService.isFirst("100001"));
    }



    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException {
       SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date parse=s.parse("2021-06-11 21:22:23");
        create_account create_account=new create_account();
        create_account.setAccountDate(parse);
        create_account.setNumber("100001");
        create_account.setAddress("广东省深圳市宝安区固戍地铁站A出口");
        create_account.setDesc("在自习室开户");
        HashMap<String,String> link01=new HashMap<>();
        link01.put("userId","number");
        link01.put("bizId","number");
        link01.put("bizTime","accountDate");
        link01.put("desc","desc");
        RebateInfo rebateInfo1= MQAdapter.filter(create_account.toString(),link01);
        System.out.println("ma.create_account(适配前)"+create_account.toString());
        System.out.println("mq.create_account(适配后)"+ JSON.toJSONString(rebateInfo1));
        System.out.println(" ");

        OrderMq orderMq=new OrderMq();
        orderMq.setOrderId("124325346546322");
        orderMq.setCreateOrderTime(new Date());
        orderMq.setSku("10999543534");
        orderMq.setUid("100001");
        HashMap<String,String> link02=new HashMap<>();
        link02.put("userId","uid");
        link02.put("bizId","orderId");
        link02.put("bizTime","createOrderTime");
        RebateInfo rebateInfo2=MQAdapter.filter(orderMq.toString(),link02);
        System.out.println("mq.orderMq(适配前)"+orderMq.toString());
        System.out.println("mq.orderMq(适配后)"+JSON.toJSONString(rebateInfo2));
    }
}
