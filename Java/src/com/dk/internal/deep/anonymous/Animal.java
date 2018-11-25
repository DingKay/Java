package com.dk.internal.deep.anonymous;

/**
 * @author dingkai
 * @date 2018/11/26 - 0:25
 */
public abstract class Animal {
    //动物的名字
    protected String name;

    public String getName() {
        return name;
    }

    //动物的抽象方法
    public abstract String eatFood();
}
