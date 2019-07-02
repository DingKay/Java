package com.dk.spring;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/7/2
 */
@Component
public class HelloWorld {

    @Resource(name = "message", type = Message.class)
    private Message message;

    public void printMessage() {
        message.getMessage();
    }
}
