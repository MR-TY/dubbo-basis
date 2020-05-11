package com.ty.service.imp;

import com.ty.bean.UserAddress;
import com.ty.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
@Service
@Component
public class UserServiceImpl1 implements UserService {

    @Override
    public List<UserAddress> getUerAddressList(String userId) {
        System.out.println("new ----------");
        UserAddress userAddress = new UserAddress(1,"成都","1","李老师","18888888883","0");
        UserAddress userAddress2 = new UserAddress(1,"成都","1","唐老师","13262798883","0");
        return Arrays.asList(userAddress,userAddress2);
    }
}
