package com.kk.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author :zhaokk
 * @date: 2018/5/10 - 10:35
 */
@Component
public class IserviceImpl implements Iservice {
    @Override
    public String SayHello(String name) {
        return  "I have a error, so You must restart me!" + name;
    }
}
