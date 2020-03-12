package com.wht.springcloud.house.userservice.controller;

import com.wht.springcloud.house.userservice.common.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/getUserName")
    public RestResponse<String> getUserName(long id){
        LOGGER.info("Incoming Request");
        return RestResponse.success("test-username");
    }
}
