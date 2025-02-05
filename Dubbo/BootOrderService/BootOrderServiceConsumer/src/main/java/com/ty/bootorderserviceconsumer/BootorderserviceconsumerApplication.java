package com.ty.bootorderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix// 开启服务容错
@SpringBootApplication
public class BootorderserviceconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootorderserviceconsumerApplication.class, args);
	}

}
