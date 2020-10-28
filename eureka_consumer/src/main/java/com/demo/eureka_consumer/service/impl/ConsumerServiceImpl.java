package com.demo.eureka_consumer.service.impl;

import com.demo.eureka_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author huangyu
 * @version 1.0
 * @date 2020/9/7 9:46
 * @function
 */
public class ConsumerServiceImpl implements ConsumerService {

    @Value("${server.port}")
    String port;

    @Override
    public String getPort() {
        return port;
    }
}
