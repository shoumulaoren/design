package com.jbit.design.bridge.channel;

import com.jbit.design.bridge.mode.IPayMode;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 19:46
 */

public class ZfbPay extends Pay{
    private Logger log= Logger.getLogger(ZfbPay.class.getName());
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {

        log.info("模拟支付宝渠道支付划账开始，uId->"+uId+",tradeId->"+tradeId+",amount->"+amount);
        boolean security= payMode.security(uId);
        if (!security) {
            log.info("模拟支付宝渠道支付划账拦截，uId->"+uId+",tradeId->"+tradeId+",amount->"+amount);
            return "0001";
        }
        log.info("模拟支付宝渠道支付划账成功，uId->"+uId+",tradeId->"+tradeId+",amount->"+amount);
        return "0000";
    }
}
