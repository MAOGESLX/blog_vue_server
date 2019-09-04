package com.sustly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@MapperScan(basePackages = "com.systly.dao")
public class BlogAdminProviderHystrix {
    public static void main(String[] args) {
        SpringApplication.run(BlogAdminProviderHystrix.class, args);
    }
}