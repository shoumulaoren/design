package com.jbit.design.bridge.mode;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 19:47
 */

public class PayFaceMode implements IPayMode{
    private Logger log= Logger.getLogger(PayFaceMode.class.getName());
    @Override
    public boolean security(String uId) {
        log.info("人脸支付，风险校验脸部识别");
        return true;
    }
}
