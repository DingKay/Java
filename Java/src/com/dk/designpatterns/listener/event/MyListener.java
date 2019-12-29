package com.dk.designpatterns.listener.event;

/**
 * Implements {@link Listenable} Interface.
 * @author DingKai
 * @version 1.0
 */
public class MyListener implements Listenable {
    @Override
    public void eventChanged(MyEvent event) {
        System.out.println("value changed to : " + event.getValue());
    }
}
