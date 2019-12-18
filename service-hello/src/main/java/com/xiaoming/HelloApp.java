package com.xiaoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //开启FeignClient注解
public class HelloApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(HelloApp.class,args);
        System.out.println( "Hello World!" );
    }
}
