package com.xiaoming.fegin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Value("${server.port}")
    private String port;
    @Override
    public String sayHiFromClientOne() {
        return "Hello world from service-feign "+port;
    }

    @Override
    public String sayHiFromName(String name) {
        return "Hello world from "+port+",name="+name;
    }

    @Override
    public String sayHiForName(String name) {
        return "Hello world for "+port+",my name is ="+name;
    }
}
