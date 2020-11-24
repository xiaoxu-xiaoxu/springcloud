package com.xiaoxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerconOrder80Main {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerconOrder80Main.class, args);
    }
}
