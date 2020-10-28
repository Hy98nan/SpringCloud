package com.demo.eureka_provider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private String port;

    @Value("${spring.application.name}")
    String projectname;

    /**
     * @author huangyu
     * @function 输出当前执行的名称以及端口
     * @date 2020/9/8 16:39
     * @param[]
     * @return java.lang.String
     */
    @RequestMapping("/hello")
    public String hello(){
        try {
            //Thread.sleep(2000);
            System.out.println("port = " + port + "当前服务名称：" + projectname);
            return port+"-----"+projectname;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
}
