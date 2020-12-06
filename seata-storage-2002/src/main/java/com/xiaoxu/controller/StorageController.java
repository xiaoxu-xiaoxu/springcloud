package com.xiaoxu.controller;

import com.xiaoxu.bean.JsonResp;
import com.xiaoxu.service.IStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("storage")
public class StorageController {

    @Resource
    private IStorageService storageService;

    @RequestMapping("decrease")
    @ResponseBody
    public JsonResp decrease(Long productId, Integer count){
        JsonResp resp = new JsonResp();
        int result = storageService.update(productId, count);
        if(result < 1){
            resp.setResult(0);
            resp.setMsg("失败");
            return resp;
        }
        resp.setResult(1);
        resp.setMsg("成功");
        return resp;
    }
}
