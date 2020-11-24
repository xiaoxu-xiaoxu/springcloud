package com.xiaoxu.service;

import com.xiaoxu.bean.Payment;

import java.util.List;


public interface IPaymentService {

    List<Payment> selectAll();
}
