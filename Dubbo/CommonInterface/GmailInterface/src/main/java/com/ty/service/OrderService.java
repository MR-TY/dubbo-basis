package com.ty.service;

import com.ty.bean.UserAddress;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
@Component
public interface OrderService {

    public List<UserAddress> initOrder(String userId);
}
