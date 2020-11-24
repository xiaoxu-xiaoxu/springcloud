package com.xiaoxu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@RequestMapping("payment")
@Controller
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("port")
    @ResponseBody
    public String getPort(){
        return port + "\t" + UUID.randomUUID().toString();
    }
}
