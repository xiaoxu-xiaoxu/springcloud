package com.xiaoxu.service;

import com.xiaoxu.service.IPaymentHystrixService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class PaymentHystrixService  implements IPaymentHystrixService{

    public String select() {
        return "hahahahhaah";
    }


    public String late() {
        return "null";
    }
}
