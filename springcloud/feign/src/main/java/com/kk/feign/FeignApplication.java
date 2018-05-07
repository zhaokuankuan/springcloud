package com.kk.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现功能
@EnableFeignClients  //注解开启Feign的功能
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
