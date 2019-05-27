package com.dk.designpatterns.listener.event;

/**
 * @author DingKai
 * @Classname Listenable
 * @Description Listener Interface.
 * @create 2019/1/30
 */
public interface Listenable {
    /**
     * event listen
     * @author DingKai
     * @date 2019/5/27
     * @param event
     * @return void
     * @throws
     */
    void eventChanged(MyEvent event);
}
