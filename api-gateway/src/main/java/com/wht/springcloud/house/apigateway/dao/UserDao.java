package com.wht.springcloud.house.apigateway.dao;


import com.wht.springcloud.house.apigateway.common.RestResponse;
import com.wht.springcloud.house.apigateway.config.GenericRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    GenericRest genericRest;

    public String getUserName(Long id){
        String url = "http://user-service/getUserName?id="+id;
        return genericRest.get(url, new ParameterizedTypeReference<String>() {}).getBody();
    }
}
