package com.ty.bootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo// 开启基于注解得dubbo
@SpringBootApplication
public class BootuserserviceproviderApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(BootuserserviceproviderApplication2.class, args);
    }

}
