package com.kk.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author :zhaokk
 * @date: 2018/5/8 - 17:25
 */
@FeignClient(value = "service-hi",fallback = IserviceImpl.class)
@Service
public interface Iservice {

    @RequestMapping("/hi")
    String SayHello(@RequestParam(value = "name") String name);
}
