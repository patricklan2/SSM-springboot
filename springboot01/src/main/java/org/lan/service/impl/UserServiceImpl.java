package org.lan.service.impl;

import org.lan.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void print(String name) {
        System.out.println("print " + name);
    }
}
