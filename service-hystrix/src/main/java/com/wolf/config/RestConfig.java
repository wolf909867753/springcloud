package com.wolf.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableDiscoveryClient
@Slf4j
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        log.info("======>restTemplate init start");
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(3000);
        log.info("<======restTemplate init completed");
        return restTemplate;
    }
}
