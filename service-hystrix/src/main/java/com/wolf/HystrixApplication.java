package com.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 * @EnableHystrixDashboard :断路器仪表盘
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main( String[] args ){
        SpringApplication.run(HystrixApplication.class,args);
    }
}
