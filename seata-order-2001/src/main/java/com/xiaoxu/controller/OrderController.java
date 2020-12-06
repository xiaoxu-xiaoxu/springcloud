package com.xiaoxu.controller;


import com.xiaoxu.bean.JsonResp;
import com.xiaoxu.bean.Order;
import com.xiaoxu.service.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("order")
public class OrderController {

    @Resource
    private IOrderService orderService;

    @RequestMapping("insert")
    @ResponseBody
    public JsonResp insertOrder(Order order){
        JsonResp resp = new JsonResp();
        orderService.insert(order);
        resp.setMsg("成功");
        resp.setResult(1);
        return resp;
    }

    @RequestMapping("update")
    @ResponseBody
    public JsonResp update(Long id){
        JsonResp resp = new JsonResp();
        orderService.update(id);
        resp.setMsg("成功");
        resp.setResult(1);
        return resp;
    }

}
