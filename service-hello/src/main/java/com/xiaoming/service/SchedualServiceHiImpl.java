package com.xiaoming.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Value("${server.port}")
    private String port;
    @Override
    public String sayHiFromClientOne(String name) {
        return "Hello world from "+port;
    }
}
