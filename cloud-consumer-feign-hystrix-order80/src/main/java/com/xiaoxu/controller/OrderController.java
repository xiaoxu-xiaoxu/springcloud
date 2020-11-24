package com.xiaoxu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xiaoxu.service.IPaymentHystrixService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("order")
public class OrderController {

    @Resource
    private IPaymentHystrixService ipaymentHystrixService;

    @RequestMapping("select")
    @ResponseBody
    public String select(){
        return ipaymentHystrixService.select();
    }

    @ResponseBody
    @RequestMapping("late")
    @HystrixCommand(fallbackMethod = "lateFallback", commandProperties = {
            @HystrixProperty(value = "10000", name = "execution.isolation.thread.timeoutInMilliseconds")
    })
    public String late(){
        // int a = 10 / 0;
        return ipaymentHystrixService.late();
    }

    public String lateFallback(){
        return "order等不及了或者出错了";
    }
}
