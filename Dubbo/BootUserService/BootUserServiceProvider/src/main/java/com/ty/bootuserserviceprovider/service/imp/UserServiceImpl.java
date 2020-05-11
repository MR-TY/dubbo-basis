package com.ty.bootuserserviceprovider.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ty.bean.UserAddress;
import com.ty.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
@Service// Dubbo得service，暴露接口
@Component
public class UserServiceImpl implements UserService {

    @Override
    @HystrixCommand
    public List<UserAddress> getUerAddressList(String userId) {
        System.out.println(" userSrvice-----2");
        UserAddress userAddress = new UserAddress(1,"成都","1","李老师","13262798883","0");
        UserAddress userAddress2 = new UserAddress(1,"成都","1","唐老师","13262798883","0");
        return Arrays.asList(userAddress,userAddress2);
    }
}
