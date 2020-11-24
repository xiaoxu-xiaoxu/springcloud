package com.xiaoxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginOrder80Main {
    public static void main(String[] args) {
        int a = 0;
        SpringApplication.run(FeginOrder80Main.class, args);
    }
}
