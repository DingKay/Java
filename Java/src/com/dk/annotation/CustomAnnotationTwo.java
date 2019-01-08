package com.dk.annotation;

/**
 * @author DingKai
 * @Classname CustomAnnotationTwo
 * @Description TODO
 * @create 2019/1/8
 */
public @interface CustomAnnotationTwo {
    String username();
    String password();
}

class TestTwo{
    @CustomAnnotationTwo(username = "KayDing",password = "123456")
    public void login(){}
}
