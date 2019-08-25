package com.chadianmeiyou.haihuanguser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"com.chadianmeiyou.haihuanguser","haihuang.utils"})
@MapperScan({"haihuang.mapper"})
public class HaihuangRoomApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HaihuangRoomApplication.class).web(true).run(args);
    }

}

