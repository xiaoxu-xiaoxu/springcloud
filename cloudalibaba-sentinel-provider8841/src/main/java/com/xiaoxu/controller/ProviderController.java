package com.xiaoxu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @GetMapping("/testA")
    public String getA(){
        return "A";
    }

    @GetMapping("/testB")
    public String getB(){
        return "B";
    }
}
