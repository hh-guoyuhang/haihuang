package com.chadianmeiyou.haihuanguser;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@EnableDiscoveryClient
@SpringBootApplication
public class HaihuangMoneyApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HaihuangMoneyApplication.class).web(true).run(args);
    }

}

