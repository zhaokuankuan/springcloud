package com.kk.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/14 - 17:14
 */
@RestController
public class HelloController {

    @Value("${kk.hello}")
    private String hello;

    @RequestMapping("/hi")
    public String from(){
        return this.hello;
    }
}
