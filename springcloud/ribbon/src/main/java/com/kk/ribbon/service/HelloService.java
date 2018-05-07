package com.kk.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author :zhaokk
 * @date: 2018/5/3 - 17:35
 */
@Component
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

}
