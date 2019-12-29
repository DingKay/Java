package com.dk.designpatterns.listener.event;

/**
 * Event Source.
 * @author DingKai
 * @version 1.0
 */
public class MySource {
    private int value;

    Listenable listenable;
    public void addListener(Listenable listenable){
        this.listenable = listenable ;
    }

    public void setValue(int value) {
        this.value = value;
        fireChanged();
    }
    private void fireChanged(){
        MyEvent e = new MyEvent();
        e.setValue(value);
        listenable.eventChanged(e);
    }
}
