package com.dk.basis.feature.inherit;

import com.dk.util.Out;

import java.lang.reflect.Field;

/**
 * @author DingKai
 * @version 1.0
 */
public class TestToInherit {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class clazz = Base.class;
        // we need to prove subclass can inherit base class private method or attribute
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(clazz.newInstance());
            System.out.println(o);
        }

        Field money = clazz.getDeclaredField("money");
        System.out.println(money.toString());

        Out.print("below subclass");

        // this reflect api is direct to access base class
        Class clazzSon = Son.class.getSuperclass();
        // now to find subclass attribute
        try {
            // first use base class clazz object to find declared fields
            Field[] fields = clazzSon.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                // use subclass object access base class declared fields
                Object o = field.get(Son.class.newInstance());
                System.out.println(o);
            }
        } catch (Exception e) {
            System.out.println("NoSuchFieldException : Subclass is not found this attribute");
        }

        // newInstance an Object to direct use attribute
        Base base = (Base) clazz.newInstance();
        Son son = Son.class.newInstance();
        // if subclass presence same name with base class attribute then see below
        int age = ((Base)son).age;
        System.out.println("Son's age:" + son.age + " Base's age:" + base.age + " special age:" + age);
    }
}
