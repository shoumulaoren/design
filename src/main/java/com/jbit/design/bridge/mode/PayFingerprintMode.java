package com.jbit.design.bridge.mode;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 19:49
 */

public class PayFingerprintMode implements IPayMode{
    private Logger log= Logger.getLogger(PayFingerprintMode.class.getName());

    @Override
    public boolean security(String uId) {
        log.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
