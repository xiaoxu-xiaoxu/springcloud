package com.xiaoxu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("config")
@Controller
public class ConfigController {

    @Value("${config.info}")
    private String config;

    @RequestMapping("get")
    @ResponseBody
    public String get(){
        return config;
    }
}
