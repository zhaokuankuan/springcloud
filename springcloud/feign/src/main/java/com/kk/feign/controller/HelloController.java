package com.kk.feign.controller;

import com.kk.feign.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zhaokk
 * @date: 2018/5/4 - 14:11
 */
@RestController
public class HelloController {

        @Autowired
        private IFeignService iFeignService;

        @RequestMapping(value = "/Hello",method = RequestMethod.GET)
        public String sayHello(String name){
            return iFeignService.sayHiFromClientOne(name);
        }

}
