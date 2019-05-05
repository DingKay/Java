package com.dk.design_patterns.listener.event;

/**
 * @author DingKai
 * @Classname Listenable
 * @Description Listener Interface.
 * @create 2019/1/30
 */
public interface Listenable {
    void eventChanged(MyEvent event);
}
