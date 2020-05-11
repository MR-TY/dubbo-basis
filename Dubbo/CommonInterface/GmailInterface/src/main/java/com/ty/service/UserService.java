package com.ty.service;

import com.ty.bean.UserAddress;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tangyu
 * @date 2020/4/12
 */
public interface UserService {

    public List<UserAddress> getUerAddressList(String userId);

}
