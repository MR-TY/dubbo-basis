package com.ty;

import com.ty.service.OrderService;
import com.ty.service.imp.OrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:D:\\Java\\Dubbo\\OrderService\\OrderServiceConsumer\\src\\main\\resource\\consumer.xml");
        OrderServiceImpl orderService = applicationContext.getBean(OrderServiceImpl.class);
        orderService.initOrder("1");
        System.out.println("1");
        System.in.read();
    }
}
