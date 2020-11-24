package com.xiaoxu.service;

//import com.xiaoxu.service.PaymentHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIXPAYMENT", fallback = PaymentHystrixService.class)
public interface IPaymentHystrixService {

    @GetMapping("/payment/select")
    String select();

    @RequestMapping("/payment/late")
    String late();
}
