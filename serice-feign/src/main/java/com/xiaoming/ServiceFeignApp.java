package com.xiaoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceFeignApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceFeignApp.class,args);
        System.out.println( "Hello World! ServiceFeignApp" );
    }
}
