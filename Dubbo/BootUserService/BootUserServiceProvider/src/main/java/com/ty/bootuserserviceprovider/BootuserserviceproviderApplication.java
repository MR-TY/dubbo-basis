package com.ty.bootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo// 开启基于注解得dubbo
@EnableHystrix
@SpringBootApplication
public class BootuserserviceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootuserserviceproviderApplication.class, args);
    }

}
