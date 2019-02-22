package com.dk.designPatterns.factory_pizza.interf;

/**
 * @author DingKai
 * @Classname Pizza
 * @Description The Pizza Interface
 * @create 2019/2/22
 */
public interface Pizza {
    void prepare();

    void bake();

    void cut();

    void box();
}
