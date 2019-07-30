package com.chadianmeiyou.haihuangcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HaihuangCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaihuangCloudApplication.class, args);
    }

}
