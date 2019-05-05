package com.dk.design_patterns.listener.event;

/**
 * @author DingKai
 * @Classname MySource
 * @Description Event Source.
 * @create 2019/1/30
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
