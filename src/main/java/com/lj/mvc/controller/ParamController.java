package com.lj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ParamController {
    //参数名获取
    @RequestMapping("/testParam")

    public String testParam(@RequestParam(value = "username",required = true,defaultValue = "111")String user_name ,
                            String password,
                            String[] hobby,
                            @RequestHeader("Host") String host,
                            @CookieValue("JSESSIONID") String jsessionid){
        System.out.println("username"+user_name+",password"+password+",hobby"+hobby +",Host" +host+",JSESSIONID"+jsessionid);
        return "target";
    }
    @RequestMapping("/test1")
    public String testt(){
        return "test_param";
    }
}
