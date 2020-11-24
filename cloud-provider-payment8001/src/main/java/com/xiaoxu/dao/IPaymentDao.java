package com.xiaoxu.dao;

import com.xiaoxu.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Mapper
public interface IPaymentDao {
    List<Payment> selectAll();
}
