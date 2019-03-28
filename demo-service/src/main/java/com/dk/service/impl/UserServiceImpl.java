package com.dk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dk.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "Hello.Dubbox!";
    }
}
