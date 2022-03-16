package com.alan.controller;

import com.alan.bean.Nabfusers;
import com.alan.service.UserService;
import com.alan.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public List<Nabfusers> getUsers(String userId){
        UserServiceImpl userService = new UserServiceImpl();
        return userService.gitUserInfo(userId);

    }

}
