package com.jbit.design.bridge.mode;

/**
 * @author 32621
 * @description 支付模式
 * @date 2021/6/13 19:38
 */
public interface IPayMode {
    /**
     * 风控校验
     * @param uId
     * @return
     */
    boolean security(String uId);
}
