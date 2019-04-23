package com.dk.designPatterns.listener.event;

/**
 * @author DingKai
 * @Classname Test
 * @Description TODO
 * @create 2019/1/31
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
