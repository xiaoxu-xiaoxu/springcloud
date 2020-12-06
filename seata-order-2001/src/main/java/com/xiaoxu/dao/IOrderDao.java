package com.xiaoxu.dao;

import com.xiaoxu.bean.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOrderDao {

    void insert(Order order);

    void update(Long id);

    Order select(Long id);
}
