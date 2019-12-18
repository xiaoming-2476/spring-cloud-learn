package com.xiaoming.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用feign调用服务提供者服务
 * 使用hystricx feign配置异常处理类
 */
@FeignClient(name = "service-feign",fallback = EurekaEurekaFeignServiceFailure.class)  //声明服务节点
public interface EurekaFeignService {

    //第一个坑：使用Feign的时候,如果参数中带有@PathVariable形式的参数,则要用value=""标明对应的参数,否则会抛出IllegalStateException异常
    @GetMapping("/hi")
    public String sayHiFromClientOne();

    //这个地方的方法名，可以和feign服务端接口的名字不一样。
    @GetMapping("/hi/{name}")
    public String sayHello(@PathVariable(value = "name") String name);

    //第二个坑：使用Feign的时候,如果参数中带有@RequestParam形式的参数,则要用value=""标明对应的参数
    @GetMapping("/hi/some")
    public String sayHiFromSome(@RequestParam(value = "name") String name);
}
