package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/testExceptionHandle")
    public String testError(){
        System.out.println(1/0);
        return "target";
    }
}
