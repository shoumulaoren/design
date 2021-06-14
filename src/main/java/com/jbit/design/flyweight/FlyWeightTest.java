package com.jbit.design.flyweight;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 13:37
 */

public class FlyWeightTest {
    private Logger log= Logger.getLogger(FlyWeightTest.class.getName());
    private ActivityController activityController=new ActivityController();
    @Test
    public void test() throws InterruptedException {
        for (int i=0;i<10;i++){
            Long req=10001L;
            Activity activity=activityController.queryActivityInfo(req);
            log.info("测试结果：req->"+req+",activity->"+ JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }
}
