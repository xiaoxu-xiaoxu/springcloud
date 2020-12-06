package com.xiaoxu.dao;

import com.xiaoxu.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Map;

@Mapper
public interface IAccountDao {


    int update(@Param("userId")Long userId, @Param("money")BigDecimal money);

}
