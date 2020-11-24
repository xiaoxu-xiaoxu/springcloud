package com.xiaoxu.controller;

import com.xiaoxu.bean.JsonResp;
import org.springframework.beans.factory.annotation.Value;
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

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("selectAll")
    @ResponseBody
    public JsonResp selectAll(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/selectAll", JsonResp.class);
    }


}
