package com.xiaoxu.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("payment")
@Controller
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("select")
    @ResponseBody
    public String select(){
        return Thread.currentThread().getName() + "\t" + port;
    }

    @RequestMapping("late")
    @ResponseBody
    @HystrixCommand(defaultFallback = "lateFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "16500")
    })
    public String late(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + "\t" + port + "\t" + "3秒";
    }

    public String lateFallback(){
        return "调用超时或者出错";
    }

}
