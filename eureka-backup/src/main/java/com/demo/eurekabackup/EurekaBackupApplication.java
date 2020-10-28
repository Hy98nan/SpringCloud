package com.demo.eurekabackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBackupApplication.class, args);
    }

}
