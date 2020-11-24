package com.xiaoxu.service.impl;

import com.xiaoxu.bean.Payment;
import com.xiaoxu.dao.IPaymentDao;
import com.xiaoxu.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Resource
    private IPaymentDao paymentDao;

    @Override
    public List<Payment> selectAll() {
        return paymentDao.selectAll();
    }
}
