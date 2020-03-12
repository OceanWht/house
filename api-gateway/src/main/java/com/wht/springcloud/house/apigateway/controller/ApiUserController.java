package com.wht.springcloud.house.apigateway.controller;

import com.wht.springcloud.house.apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiUserController {

    @Autowired
    UserService userService;

    @RequestMapping("test/getUserName")
    public String getUserName(Long id){
        return userService.getUserName(id);
    }
}
