package com.kk.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/15 - 17:30
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${kk.hello}")
    String hello;

    @RequestMapping("/hello")
    public String sayHello(){
        return  this.hello;
    }

}
