package com.xiaoxu.service;

import com.xiaoxu.bean.JsonResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Service
public interface IPaymentService {

    @RequestMapping("/payment/selectAll")
    public JsonResp selectAll();
}
