package com.xiaoming.controller;

import com.xiaoming.config.FeignConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerController {
    @Autowired
    private FeignConfig feignConfig;

    @GetMapping("/helloworld")
    public String sayHiFromClientOne() {
        return this.feignConfig.sayHiFromClientOne();
    }

    //这个地方的方法名
    @GetMapping("/helloworld/{name}")
    public String sayHiFromClientOne(@PathVariable String name) {
        return this.feignConfig.sayHello(name);
    }

    @GetMapping("/helloworld/some")
    public String sayHiFromClientSome(@RequestParam String name) {
        return this.feignConfig.sayHiFromSome(name);
    }
}
