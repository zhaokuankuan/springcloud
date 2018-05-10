package com.kk.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author :zhaokk
 * @date: 2018/5/8 - 16:47
 */
@Service
public class service {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hasError" )
    public  String  sayHello(String name){
        return  this.restTemplate.getForObject("http://service-hi/hi?name=" + name,String.class);
    }

    public String hasError(String name){
        return  "I have a error, so You must restart me!" + name;
    }
}
