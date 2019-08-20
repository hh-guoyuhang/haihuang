package com.chadianmeiyou.haihuanguser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class HaihuangDynamicApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HaihuangDynamicApplication.class).web(true).run(args);
    }

}

