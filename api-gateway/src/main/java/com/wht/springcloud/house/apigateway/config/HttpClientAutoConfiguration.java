package com.wht.springcloud.house.apigateway.config;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({HttpClient.class}) //表示httpclient这个类存在得情况下才会加载这个配置类
@EnableConfigurationProperties(HttpClientProperties.class)
public class HttpClientAutoConfiguration {

    private final HttpClientProperties httpClientProperties;

    public HttpClientAutoConfiguration(HttpClientProperties httpClientProperties) {
        this.httpClientProperties = httpClientProperties;
    }

    //创建Bean实例
    @Bean
    @ConditionalOnMissingBean(HttpClient.class)//表示如果用户没有创建则在这里创建，如果已经创建这里就不创建
    public HttpClient httpClient(){
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(httpClientProperties.getConnectTimeOut())
                .setSocketTimeout(httpClientProperties.getSocketTimeOut())
                .build();//构建requestConfig

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .setUserAgent(httpClientProperties.getAgent())
                //每个服务节点的最大连接数
                .setMaxConnPerRoute(httpClientProperties.getMaxConnPerRoute())
                //总的连接数
                .setMaxConnTotal(httpClientProperties.getMaxConnTotal())
                //设置连接重用的策略，NoConnectionReuseStrategy表示每次连接都创建一个新得，消耗比较大， 默认使用长连接就不用设置就好
               // .setConnectionReuseStrategy(new NoConnectionReuseStrategy())
                .build();

        return httpClient;
    }
}
