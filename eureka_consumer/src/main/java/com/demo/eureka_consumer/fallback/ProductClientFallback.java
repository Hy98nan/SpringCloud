package com.demo.eureka_consumer.fallback;

import com.demo.eureka_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author huangyu
 * @function 使用降级机制必须要实现需要降级的接口
 * @date 2020/9/8 16:46
 */
@Component
public class ProductClientFallback implements ConsumerService {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String projectname;

    /**
     * @author huangyu
     * @function 方法内部写出错的逻辑
     * @date 2020/9/8 16:46
     * @param[]
     * @return java.lang.String
     */
    @Override
    public String getPort() {
        return "已对ConsumerService进行降级处理！"+"端口为："+port+"项目名称为："+projectname;
    }
}
