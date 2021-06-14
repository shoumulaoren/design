package com.jbit.design.chain_of_responsibility;

import lombok.Data;

/**
 * @author 32621
 * @description 责任链返回对象定义
 * @date 2021/6/14 15:05
 */
@Data
public class AuthInfo {
    private String code;
    private String info="";
    public AuthInfo(String code,String...infos){
        this.code=code;
        for (String str:infos){
            this.info=this.info.concat(str);
        }
    }
}
