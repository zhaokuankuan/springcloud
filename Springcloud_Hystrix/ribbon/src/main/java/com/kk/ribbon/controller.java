package com.kk.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/8 - 16:47
 */
@RestController
public class controller {

    @Autowired
    private service service;

    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello(String name){
        return  service.sayHello(name);
    }

}
