package com.dk.designpatterns.listener.event;

/**
 * @author DingKai
 * @Classname MyListener
 * @Description Implements {@link Listenable} Interface.
 * @create 2019/1/31
 */
public class MyListener implements Listenable {
    @Override
    public void eventChanged(MyEvent event) {
        System.out.println("value changed to : " + event.getValue());
    }
}
