package com.ty.bootorderserviceconsumer.service.imp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ty.bean.UserAddress;
import com.ty.service.OrderService;
import com.ty.service.UserService;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
@Service
public class OrderServiceImpl implements OrderService {

    // @Autowired
    // @Reference(url = "127.0.0.1:20880")// dubbo直连
    @Reference(loadbalance = "roundrobin") // 远程引用服务者暴露得接口
    UserService userService;

    @Override
    @HystrixCommand(fallbackMethod = "hello")// 出错的时候重新调用
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        // 1.查询用户的收获服务
        List<UserAddress> userAddresses = userService.getUerAddressList(userId);
        userAddresses.stream().forEach(c -> {
            System.out.println(c.getPhoneNum());
        });
        return userAddresses;
    }

    public void hello(String userId) {
        System.out.println("用户id："+userId);
    }
}
