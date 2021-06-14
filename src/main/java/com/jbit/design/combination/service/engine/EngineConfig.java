package com.jbit.design.combination.service.engine;

import com.jbit.design.combination.service.logic.LogicFilter;
import com.jbit.design.combination.service.logic.impl.UserAgeFilter;
import com.jbit.design.combination.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 32621
 * @description
 * @date 2021/6/13 21:29
 */

public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static{
        logicFilterMap=new ConcurrentHashMap<>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }
    public Map<String,LogicFilter> getLogicFilterMap(){
        return logicFilterMap;
    }
    public void setLogicFilterMap(Map<String,LogicFilter> logicFilterMap){
        this.logicFilterMap=logicFilterMap;
    }
}
