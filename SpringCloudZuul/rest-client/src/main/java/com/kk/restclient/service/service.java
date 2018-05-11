package com.kk.restclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author :zhaokk
 * @date: 2018/5/11 - 11:25
 */
@Service
public class service {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHelo(String name){
        return this.restTemplate.getForObject("http://localhost:8762/hello?name="+name,String.class);
    }
}
