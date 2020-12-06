package com.xiaoxu.service;

import com.xiaoxu.bean.JsonResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service")
public interface IAccountService {

    @RequestMapping("/account/decrease")
    JsonResp decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
