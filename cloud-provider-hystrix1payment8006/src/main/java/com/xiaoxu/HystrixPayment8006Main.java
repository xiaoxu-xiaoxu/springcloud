package com.xiaoxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment8006Main {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8006Main.class, args);
    }
}
