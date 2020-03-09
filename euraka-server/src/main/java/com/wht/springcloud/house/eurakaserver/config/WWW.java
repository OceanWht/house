package com.wht.springcloud.house.eurakaserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WWW {

    @Autowired
    ConfigDemo configDemo;

    @RequestMapping(value = "/test")
    public @ResponseBody String test(){
        return String.valueOf(configDemo.getWhtDemo().getLength());
    }


}
