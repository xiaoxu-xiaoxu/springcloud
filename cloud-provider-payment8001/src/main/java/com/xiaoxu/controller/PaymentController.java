package com.xiaoxu.controller;

import com.xiaoxu.bean.JsonResp;
import com.xiaoxu.bean.Payment;
import com.xiaoxu.service.IPaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("payment")
@Controller
public class PaymentController {
    @Resource
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("selectAll")
    @ResponseBody
    public JsonResp selectAll(){
        JsonResp resp = new JsonResp();
        List<Payment> payments = paymentService.selectAll();
        resp.setData(payments);
        resp.setResult(1);
        resp.setMsg("查询成功，端口号：" + serverPort);
        return resp;
    }

}
