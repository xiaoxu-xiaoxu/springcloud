package com.xiaoxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerzkOrder80Main {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerzkOrder80Main.class, args);
    }

}
