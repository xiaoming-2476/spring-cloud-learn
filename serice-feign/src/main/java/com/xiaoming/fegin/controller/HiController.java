package com.xiaoming.fegin.controller;

import com.xiaoming.fegin.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.sayHiFromClientOne();
    }

    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable String name){
        return schedualServiceHi.sayHiFromName(name);
    }

    @RequestMapping(value = "/hi/some",method = RequestMethod.GET)
    public String helloSome(@RequestParam String name){
        return schedualServiceHi.sayHiForName(name);
    }
}
