package com.xiaoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@EnableHystrixDashboard // 启用 HystrixDashboard 断路器看板 相关配置
@EnableDiscoveryClient // 启用 Eureka 服务发现 相关配置
@SpringBootApplication
public class HystrixDashboardApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixDashboardApplication.class,args);
        System.out.println( "Hello World HystrixDashboard!" );
    }
}
