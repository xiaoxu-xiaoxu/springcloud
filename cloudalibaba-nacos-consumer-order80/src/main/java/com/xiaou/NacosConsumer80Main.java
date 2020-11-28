package com.xiaou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer80Main {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer80Main.class, args);
    }
}
