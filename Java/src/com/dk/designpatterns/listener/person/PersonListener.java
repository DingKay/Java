package com.dk.designpatterns.listener.person;

/**
 * @author DingKai
 * @Classname PersonListener
 * @Description TODO
 * @create 2019/1/28
 */
public interface PersonListener {
    /**
     * do run method
     * @author DingKai
     * @date 2019/5/27
     * @param even
     * @return void
     */
    void dorun(Even even);

    /**
     * do eat method
     * @author DingKai
     * @date 2019/5/27
     * @param even
     * @return void
     */
    void doeat(Even even);
}
