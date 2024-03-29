package com.atguigu.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jason
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {
    public static void main( String[] args ) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
