package com.jbit.design.bridge.mode;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 19:49
 */

public class PayCypher implements IPayMode{
    private Logger log= Logger.getLogger(PayCypher.class.getName());
    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验环境安全");
        return true;
    }
}
