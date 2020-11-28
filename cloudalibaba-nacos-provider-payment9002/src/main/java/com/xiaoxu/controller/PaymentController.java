package com.xiaoxu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("payment")
public class PaymentController {


    @Value("${server.port}")
    private String port;

    @RequestMapping("get")
    @ResponseBody
    public String get(){
        return port;
    }

}
