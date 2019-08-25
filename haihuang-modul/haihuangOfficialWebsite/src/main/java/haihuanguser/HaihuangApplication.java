package haihuanguser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages={"haihuang.utils"})
@MapperScan({"haihuang.mapper"})
public class HaihuangApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HaihuangApplication.class).web(true).run(args);
    }

}

