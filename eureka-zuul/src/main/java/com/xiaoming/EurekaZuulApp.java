package com.xiaoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class EurekaZuulApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaZuulApp.class,args);
        System.out.println( "Hello World!" );
    }
}
