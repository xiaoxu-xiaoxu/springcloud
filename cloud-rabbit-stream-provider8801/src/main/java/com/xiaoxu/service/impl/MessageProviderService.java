package com.xiaoxu.service.impl;

import com.xiaoxu.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binder.Binding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageProviderService implements IMessageProviderService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        output.send(MessageBuilder.withPayload("hello").build());
        return "world";
    }
}
