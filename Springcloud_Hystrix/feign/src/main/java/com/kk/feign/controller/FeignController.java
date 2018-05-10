package com.kk.feign.controller;

import com.kk.feign.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/8 - 17:25
 */
@RestController
public class FeignController {

    @Autowired
    private Iservice iservice;

    @RequestMapping(value = "/feign/hello")
    public String sayHello(String name){
        return   iservice.SayHello(name);
    }

}
