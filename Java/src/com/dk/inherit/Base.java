package com.dk.inherit;

/**
 * @author DingKai
 * @Description 继承关系中的父类
 * @date 2018/11/19
 */
public class Base {
    //父类的私有属性 money
    private double money;

    //父类的 firstName 属性 用protected修饰 则 只能在本包内 或 子类中
    protected String firstName;

    //访问权限是public 则是所有成员都可以访问的属性
    public String Name;

    public double addMoney(){
        return 99.99d;
    }
}
