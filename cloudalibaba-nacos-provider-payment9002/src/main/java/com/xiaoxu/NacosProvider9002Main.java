package com.xiaoxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9002Main {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9002Main.class, args);
    }
}
