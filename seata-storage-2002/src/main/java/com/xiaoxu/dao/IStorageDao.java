package com.xiaoxu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface IStorageDao {

    int update(Map<String, Object> param);

}
