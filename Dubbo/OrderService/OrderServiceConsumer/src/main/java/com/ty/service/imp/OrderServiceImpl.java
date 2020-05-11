package com.ty.service.imp;

import org.springframework.stereotype.Service;
import com.ty.bean.UserAddress;
import com.ty.service.OrderService;
import com.ty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        // 1.查询用户的收获服务
        List<UserAddress> userAddresses = userService.getUerAddressList(userId);
        userAddresses.stream().forEach(c -> {
            System.out.println(c.getPhoneNum());
        });
        return userAddresses;
    }
}
