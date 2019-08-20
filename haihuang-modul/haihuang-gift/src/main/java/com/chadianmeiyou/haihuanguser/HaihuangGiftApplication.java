package com.chadianmeiyou.haihuanguser;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@EnableDiscoveryClient
@SpringBootApplication
public class HaihuangGiftApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HaihuangGiftApplication.class).web(true).run(args);
    }

}

