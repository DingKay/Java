package com.dk.designpatterns.observer.weather.progress.customize;

import com.dk.designpatterns.observer.weather.progress.customize.interf.Observer;
import com.dk.designpatterns.observer.weather.progress.customize.interf.impl.Observable;

/**
 * @author DingKai
 * @Classname ProgressBar
 * @Description Achieve Observer
 * @create 2019/2/15
 */
public class ProgressBar implements Observer {

    /**
     * the end of 'foreach' int 'i' value
     */
    private static final int END = 10;

    public void display(){
        System.out.print("#");
    }

    @Override
    public void update() {
        display();
    }

    public static void main(String[] args) throws InterruptedException {
        ProgressBar progressBar = new ProgressBar();
        Observable observable = new Observable();
        observable.registerObserver(progressBar);
        for (int i = 0; i < END; i++) {
            Thread.sleep(1000);
            observable.setChangeValue();
        }
    }
}
