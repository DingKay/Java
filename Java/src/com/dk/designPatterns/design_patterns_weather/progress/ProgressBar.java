package com.dk.designPatterns.design_patterns_weather.progress;

import com.dk.designPatterns.design_patterns_weather.progress.interf.Observer;
import com.dk.designPatterns.design_patterns_weather.progress.interf_impl.Observable;

/**
 * @author DingKai
 * @Classname ProgressBar
 * @Description TODO
 * @create 2019/2/15
 */
public class ProgressBar implements Observer {
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
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            observable.setChangeValue();
        }
    }
}
