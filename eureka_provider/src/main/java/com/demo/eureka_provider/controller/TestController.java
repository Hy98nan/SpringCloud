package com.demo.eureka_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者
 * @author huangyu
 * @version 1.0
 * @date 2020/9/4 17:30
 * @function
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String projectname;


    /**
     * @author huangyu
     * @function
     * @date 2020/9/8 16:43
     * @param[]
     * @return java.lang.String
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("port = " + port+"当前服务名称："+projectname);
        /*int i = 5 /0;*/
        return port+"-----"+projectname;
    }
}
