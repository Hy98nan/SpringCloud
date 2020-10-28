package com.demo.eureka_consumer.controller;

import com.demo.eureka_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyu
 * @version 1.0
 * @date 2020/9/4 17:39
 * @function
 */
@RestController
public class FeignTest {

    @Autowired
    ConsumerService service;

    @Value("${server.port}")
    String port;

    /**
     * @author huangyu
     * @function 返回当前服务的端口
     * @date 2020/9/8 16:47
     * @param[]
     * @return java.lang.String
     */
    @RequestMapping("/hello")
    public String hello(){
        String port = service.getPort();
        return port;
    }
}
