package com.jbit.design.chain_of_responsibility;

import com.alibaba.fastjson.JSON;
import com.jbit.design.chain_of_responsibility.impl.Level1AuthLink;
import com.jbit.design.chain_of_responsibility.impl.Level2AuthLink;
import com.jbit.design.chain_of_responsibility.impl.Level3AuthLink;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 15:37
 */

public class ChainTest  {
    private Logger log= Logger.getLogger(ChainTest.class.getName());
    @Test
    public void Test() throws ParseException{
        AuthLink authLink=new Level3AuthLink("100013","王工")
        .appendNext(new Level2AuthLink("100012","张经理"))
        .appendNext(new Level1AuthLink("100011","段总"));
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate =f.parse("2020-06-18 23:49:46");

        log.info("测试结果："+ JSON.toJSONString(authLink.doAuth("小傅哥","1000998004813441",currentDate)));
        //模拟三级负责人审批
        AuthService.auth("100013","1000998004813441");
        log.info("测试结果：模拟三级负责人审批，王工");
        log.info("测试结果："+JSON.toJSONString(authLink.doAuth("小傅哥","1000998004813441",currentDate)));
        //模拟二级负责人审批
        AuthService.auth("100012","1000998004813441");
        log.info("测试结果：模拟二级负责人审批，张经理");
        log.info("测试结果："+JSON.toJSONString(authLink.doAuth("小傅哥","1000998004813441",currentDate)));
        //模拟一级负责人审批
        AuthService.auth("100011","1000998004813441");
        log.info("测试结果："+"模拟一级负责人审批，段总");
        log.info("测试结果："+JSON.toJSONString(authLink.doAuth("小傅哥","1000998004813441",currentDate)));


    }



}
