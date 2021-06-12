package com.jbit.design.prototype.util;

import java.util.*;

/**
 * @author 32621
 * @description
 * @date 2021/6/12 16:22
 */

public class TopicRandomUtil {
    static public Topic random(Map<String,String> option,String key){
        Set<String> keySet=option.keySet();
        ArrayList<String> keyList=new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String,String> optionNew=new HashMap<>();
        int idx=0;
        String keyNew="";
        for (String next : keySet){
            String randomKey=keyList.get(idx++);
            if(key.equals(next)){
                keyNew=randomKey;
            }
            optionNew.put(randomKey,option.get(next));
        }
        return new Topic(optionNew,keyNew);

    }
}
