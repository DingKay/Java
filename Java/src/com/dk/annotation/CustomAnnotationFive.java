package com.dk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author DingKai
 * @Classname CustomAnnotationFive
 * @Description TODO
 * @create 2019/1/21
 */
public class CustomAnnotationFive {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Test{}

    class Junit{
        public void test1(){}
        public void test2(){}
        public void test3(){}
        public void test4(){}
    }

    public static void main(String[] args) {

    }
}
