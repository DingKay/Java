package com.dk.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/7/2
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloWorld helloworld = (HelloWorld)context.getBean("helloWorld");
        helloworld.printMessage();
        Message message = (Message)context.getBean("message");
        message.setMessage("I'm Java Developer!");
        helloworld.printMessage();
    }
}
