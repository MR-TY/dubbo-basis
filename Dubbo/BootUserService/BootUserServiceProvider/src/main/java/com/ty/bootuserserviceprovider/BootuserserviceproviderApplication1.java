package com.ty.bootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo// 开启基于注解得dubbo
@SpringBootApplication
public class BootuserserviceproviderApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(BootuserserviceproviderApplication1.class, args);
    }

}
