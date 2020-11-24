package com.xiaoxu.controller;

import com.xiaoxu.bean.JsonResp;
import com.xiaoxu.service.IPaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("order")
public class FeginOrderController {

    @Resource
    private IPaymentService paymentService;

    @RequestMapping("select")
    @ResponseBody
    public JsonResp select(){
        return paymentService.selectAll();
    }

}
