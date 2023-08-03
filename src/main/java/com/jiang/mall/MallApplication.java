package com.jiang.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.jiang.mall.mapper")
@SpringBootApplication
public class MallApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MallApplication.class, args);
        System.out.println("hell.git4");
        Object jiang = run.getBean("jiang");
        Object jiang1 = run.getBean("jiang");

    }

}
