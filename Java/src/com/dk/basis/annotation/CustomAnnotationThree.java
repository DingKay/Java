package com.dk.basis.annotation;

/**
 * To learn annotation.
 * @author DingKai
 * @version 1.0
 */
public @interface CustomAnnotationThree {
    String userName() default "KayDing";
    String password() default "123456";
}

class TestThree{
    @CustomAnnotationThree
    public void login(){}

    @CustomAnnotationThree()
    public void register(){}
}
