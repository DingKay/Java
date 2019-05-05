package com.dk.basis.annotation;

/**
 * @author DingKai
 * @Classname CustomAnnotationThree
 * @Description To learn annotation.
 * @create 2019/1/8
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
