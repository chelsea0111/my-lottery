package com.xxy.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Configurable
@EnableDubbo
public class LotteryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LotteryApplication.class, args);
        System.out.println("context = " + context);
    }

}
