package com.dk.inherit;

import java.lang.reflect.Field;

/**
 * @author DingKai
 * @date 2018/11/19
 */
public class TestToInherit {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class clazz = Base.class;
        // we need to prove subclass can inherit base class private method or attribute
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            Object o = declaredField.get(Base.class.newInstance());
//            System.out.println(o);
//        }

        Field money = clazz.getDeclaredField("money");
        System.out.println(money.toString());
    }
}
