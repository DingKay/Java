package com.dk.basis.feature.inherit;

/**
 * @author DingKai
 * @version 1.0
 */
public class Base {
    /**
     * private attribute 'money' , can't inherit?
     * actually subclass inherit base class private attribute, but can't use this private attribute
     * we can use reflect find it
     */
    private double money = 20D;

    /**
     * protected attribute 'firstName', only subclass can use or inherit this attribute
     */
    protected String firstName = "Ding";

    /**
     * public attribute 'name'
     */
    public String name = "Kay";

    /**
     * same attribute name
     */
    public int age = 20;

    /**
     * subclass inherit this simple method
     * @author DingKai
     * @date 2019/4/19
     * @param
     * @return double
     * @exception
     */
    public double addMoney(){
        return 99.99D;
    }

}
