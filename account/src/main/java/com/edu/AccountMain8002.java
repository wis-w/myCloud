package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 20:37
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AccountMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(AccountMain8002.class, args);
    }
}
