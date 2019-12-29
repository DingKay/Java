package com.dk.designpatterns.listener.event;

/**
 * Listener Interface.
 * @author DingKai
 * @version 1.0
 */
public interface Listenable {
    /**
     * event listen
     * @author DingKai
     * @param event the event obj
     */
    void eventChanged(MyEvent event);
}
