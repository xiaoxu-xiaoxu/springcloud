package com.xiaoxu.controller;


import com.xiaoxu.bean.JsonResp;
import com.xiaoxu.service.IAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RequestMapping("account")
@Controller
public class AccountController {

    @Resource
    private IAccountService accountService;

    @ResponseBody
    @RequestMapping("decrease")
    public JsonResp decrease(Long userId, BigDecimal money){
        JsonResp resp = new JsonResp();
        int result = accountService.update(userId, money);
        if(result < 1){
            resp.setMsg("失败");
            resp.setResult(0);
            return resp;
        }
        resp.setMsg("成功");
        resp.setResult(1);
        return resp;
    }
}
