package com.Controller;

import com.bean.Employee;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println(requestBody);
        return "target";
    }
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String>request){
        System.out.println(request.getHeaders());
        System.out.println(request.getBody());
        return "target";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello");
    }
    @RequestMapping("/testResponseBody")
    @ResponseBody
//    加入json依赖可返回类对象
    public Employee testResponseBody() {
        Employee employee = new Employee(1,"a","b",2);
        return employee;
    }

}
