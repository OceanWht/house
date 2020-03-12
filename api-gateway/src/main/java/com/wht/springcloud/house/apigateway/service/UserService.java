package com.wht.springcloud.house.apigateway.service;


import com.wht.springcloud.house.apigateway.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public String getUserName(Long id){
       return userDao.getUserName(id);
    }
}
