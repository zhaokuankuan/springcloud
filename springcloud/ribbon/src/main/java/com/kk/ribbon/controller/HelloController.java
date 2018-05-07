package com.kk.ribbon.controller;

import com.kk.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/3 - 17:36
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
