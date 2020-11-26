package com.xiaoxu.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;


public interface IMessageProviderService {

    String send();
}
