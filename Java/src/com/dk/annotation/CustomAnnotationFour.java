package com.dk.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author DingKai
 * @Classname CustomAnnotationFour
 * @Description To learn annotation : Create default value annotation
 * @create 2019/1/8
 */
public class CustomAnnotationFour {
    @Inherited
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Login{
        String userName() default "dk";

        String password() default "123456";
    }

    @Login
    @Deprecated
    public void info(){}

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = CustomAnnotationFour.class.getMethod("info");
        boolean annotationPresent = method.isAnnotationPresent(Login.class);
        if (annotationPresent) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation != null && annotation instanceof Login){
                String name = ((Login) annotation).userName();
                System.out.println("name = " + name);
                String pwd = ((Login) annotation).password();
                System.out.println("pwd = " + pwd);
            }
            System.out.println("annotation = " + annotation);
        }
    }
}
