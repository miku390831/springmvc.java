package com.lj.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
//    @RequestMapping(value = "/")
//    public String index(){
//        return "index";
//    }
    @RequestMapping(value = {"/target","/test"},method = {RequestMethod.GET})
    public String toTarget(){
        return "target";
    }
    @RequestMapping(value = "/testput",
                    method = {RequestMethod.POST,RequestMethod.GET},
                    params = {"username","password=123456"},
                    headers = {"Host: localhost:8080"})
    public String testPut(){
        return "target";
    }
}
