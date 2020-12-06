package com.xiaoxu.service;


import com.xiaoxu.bean.JsonResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
public interface IStorageService {

    @RequestMapping("/storage/decrease")
    JsonResp decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
