package com.wht.springcloud.house.eurakaserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component 与用@EnableConfigurationProperties(ConfigDemo.class) 效果一致
@ConfigurationProperties(prefix = "wht",ignoreInvalidFields = true)
public class ConfigDemo {
    private WhtDemo whtDemo = new WhtDemo();

    public WhtDemo getWhtDemo() {
        return whtDemo;
    }

    public void setWhtDemo(WhtDemo whtDemo) {
        this.whtDemo = whtDemo;
    }
}
