package com.xiaoxu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

@Controller
@EnableBinding(Sink.class)
public class ReceiveController {

    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void get(Message<String> message){
        String messages = message.getPayload();
        System.out.println("接收到的消息：" + messages + "，端口号为：" + port);
    }

}
