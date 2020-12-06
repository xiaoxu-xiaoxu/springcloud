package com.xiaoxu.service.impl;

import com.xiaoxu.bean.Order;
import com.xiaoxu.dao.IOrderDao;
import com.xiaoxu.service.IAccountService;
import com.xiaoxu.service.IOrderService;
import com.xiaoxu.service.IStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService implements IOrderService{

    @Resource
    private IOrderDao orderDao;

    @Resource
    private IStorageService storageService;

    @Resource
    private IAccountService accountService;


    @Override
    @GlobalTransactional
    public void insert(Order order) {
        // 订单插入
        orderDao.insert(order);
        // 减少库存
        storageService.decrease(order.getProductId(), order.getCount());

        //int i = 10 / 0;
    }

    @Override
    public void update(Long id) {
        Order order = orderDao.select(id);
        // 将订单状态改为已付款
        orderDao.update(id);
        // 减少余额
        accountService.decrease(order.getUserId(), order.getMoney());
    }
}
