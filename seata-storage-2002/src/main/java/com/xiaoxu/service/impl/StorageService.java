package com.xiaoxu.service.impl;

import com.xiaoxu.dao.IStorageDao;
import com.xiaoxu.service.IStorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class StorageService implements IStorageService {

    @Resource
    private IStorageDao storageDao;

    @Override
    public int update(Long productId, Integer count) {
        Map<String, Object> map = new HashMap<>();
        map.put("productId", productId);
        map.put("count", count);
        return storageDao.update(map);
    }
}
