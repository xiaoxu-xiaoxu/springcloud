package com.xiaou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
@RequestMapping("order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("getPort")
    @ResponseBody
    public String get(){
        return restTemplate.getForObject("http://cloudalibaba-nacos-payment/payment/get", String.class);
    }
}
