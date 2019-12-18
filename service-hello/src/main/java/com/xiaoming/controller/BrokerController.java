package com.xiaoming.controller;

import com.xiaoming.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerController {
    @Autowired
    private EurekaFeignService eurekaFeignService;

//    @HystrixCommand(fallbackMethod = "getInfoFailure") ribbon客户端的hystircx写法
    @GetMapping("/helloworld")
    public String sayHiFromClientOne() {
        return this.eurekaFeignService.sayHiFromClientOne();
    }

    //这个地方的方法名
    @GetMapping("/helloworld/{name}")
    public String sayHiFromClientOne(@PathVariable String name) {
        return this.eurekaFeignService.sayHello(name);
    }

    @GetMapping("/helloworld/some")
    public String sayHiFromClientSome(@RequestParam String name) {
        return this.eurekaFeignService.sayHiFromSome(name);
    }

    /**
     * 服务 EUREKA-PROVIDER/hello 调用失败的回调方法
     *
     * @return
     */
    public String getInfoFailure() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }
}
