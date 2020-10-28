package com.demo.eureka_consumer.service;

import com.demo.eureka_consumer.fallback.ProductClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 消费者
 * @author huangyu
 * @version 1.0
 * @date 2020/9/7 9:32
 * @function 当前服务使用了负载均衡和降级
 * 负载均衡：FeignClient中的name属性后面跟着需要负载的服务名称
 * 降级：fallback后面跟着出现错误降级处理的自定义类
 */
@Component
@FeignClient(name = "eureka-provider",fallback = ProductClientFallback.class)
public interface ConsumerService {

    @RequestMapping("/hello")
    String getPort();

}
