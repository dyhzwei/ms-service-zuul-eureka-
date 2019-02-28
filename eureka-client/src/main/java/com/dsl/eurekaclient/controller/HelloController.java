package com.dsl.eurekaclient.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello:"+name;
    }
}
