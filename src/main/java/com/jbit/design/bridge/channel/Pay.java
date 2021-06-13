package com.jbit.design.bridge.channel;

import com.jbit.design.bridge.mode.IPayMode;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description 支付类型桥接抽象类
 * @date 2021/6/13 19:39
 */

public abstract class Pay {
    private Logger log= Logger.getLogger(Pay.class.getName());
    protected IPayMode payMode;
    public Pay(IPayMode payMode){
        this.payMode=payMode;
    }

    /**
     * 划账接口
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
