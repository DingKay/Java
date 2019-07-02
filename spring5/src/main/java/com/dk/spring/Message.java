package com.dk.spring;

import org.springframework.stereotype.Component;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/7/2
 */
@Component
public class Message {

    private String message;

    public void getMessage() {
        System.out.println("Your Message :" + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
