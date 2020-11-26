package com.xiaoxu.controller;

import com.xiaoxu.service.IMessageProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.print.DocFlavor;

@RequestMapping("message")
@Controller
public class MessageController {

    @Resource
    private IMessageProviderService messageProviderService;

    @RequestMapping("send")
    @ResponseBody
    public String send(){
        return messageProviderService.send();
    }
}
