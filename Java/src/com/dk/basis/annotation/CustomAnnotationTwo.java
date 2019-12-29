package com.dk.basis.annotation;

/**
 * To learn annotation : Input parameter in annotation
 * @author DingKai
 * @version 1.0
 */
public @interface CustomAnnotationTwo {
    String username();
    String password();
}

class TestTwo{
    @CustomAnnotationTwo(username = "KayDing",password = "123456")
    public void login(){}
}
