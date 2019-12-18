package com.xiaoming.controller;

import com.xiaoming.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    //这里不写eureka的注册中心，而是写服务提供者的应用名
    @GetMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForEntity("http://service-feign/hi", String.class).getBody();
    }
}
