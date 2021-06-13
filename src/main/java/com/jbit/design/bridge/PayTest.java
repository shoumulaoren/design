package com.jbit.design.bridge;

import com.jbit.design.bridge.channel.Pay;
import com.jbit.design.bridge.channel.WxPay;
import com.jbit.design.bridge.channel.ZfbPay;
import com.jbit.design.bridge.mode.PayCypher;
import com.jbit.design.bridge.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 19:51
 */

public class PayTest {
    @Test
    public void test(){
        System.out.println("\r\n模拟测试场景：微信支付，密码方式");
        Pay wxPay=new WxPay(new PayCypher());
        wxPay.transfer("weixin_10000","11111111111",new BigDecimal(100));

        System.out.println("\r\n模拟测试场景：支付宝支付，指纹方式");
        Pay zfbPay=new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("zfb_434223","435453453454354",new BigDecimal(200));
    }
}
