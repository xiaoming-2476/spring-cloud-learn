package com.xiaoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixTurbineApp.class,args);
        System.out.println( "Hello World HystrixTurbineApp!" );
    }
}
