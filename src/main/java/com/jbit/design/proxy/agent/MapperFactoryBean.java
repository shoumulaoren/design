package com.jbit.design.proxy.agent;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.util.logging.Logger;

/**
 * @author 32621
 * @description
 * @date 2021/6/14 14:01
 */

public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Logger log= Logger.getLogger(MapperFactoryBean.class.getName());
    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler handler=(proxy,method,args)->{
            Select select=method.getAnnotation(Select.class);
            log.info("SQL:"+select.value().replace("#{id}",args[0].toString()));
            return args[0]+",小傅哥，bugstack.cn";
        };
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, (org.springframework.cglib.proxy.InvocationHandler) handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
