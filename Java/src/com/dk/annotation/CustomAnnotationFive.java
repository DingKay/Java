package com.dk.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author DingKai
 * @Classname CustomAnnotationFive
 * @Description To Learn Annotation.
 * @create 2019/1/21
 */
public class CustomAnnotationFive {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Test {
    }

    class Junit {
        @Test
        public void test1() {
        }

        public void test2() {
        }

        public void test3() {
        }

        @Test
        public void test4() {
        }
    }

    public static void main(String[] args) {
        int anInt = 0, annInt = 0;
        Method[] methods = Junit.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                anInt++;
            } else {
                annInt++;
            }
        }
        System.out.println("@Test Method " + anInt + "\n" + "No This Annotation " + annInt);

    }
}
