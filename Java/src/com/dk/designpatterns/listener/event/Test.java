package com.dk.designpatterns.listener.event;

/**
 * @author DingKai
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MySource mySource = new MySource();
        MyListener myListener = new MyListener();
        mySource.addListener(myListener);
        mySource.setValue(10);
        mySource.setValue(20);
    }
}
