package com.dk.designpatterns.listener.person;

/**
 * @author DingKai
 * @version 1.0
 */
public interface PersonListener {
    /**
     * do run method
     * @author DingKai
     * @param even Even obj
     */
    void doRun(Even even);

    /**
     * do eat method
     * @author DingKai
     * @param even Even obj
     */
    void doEat(Even even);
}
