package com.xiaoxu.service.impl;

import com.xiaoxu.bean.Account;
import com.xiaoxu.dao.IAccountDao;
import com.xiaoxu.service.IAccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService implements IAccountService {

    @Resource
    private IAccountDao accountDao;

    @Override
    @GlobalTransactional
    public int update(Long userId, BigDecimal money) {
        return accountDao.update(userId, money);
    }
}
