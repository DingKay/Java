package com.dk.annotation;

/**
 * @author DingKai
 * @Classname CustomAnnotationOne
 * @Description To Learn Annotation 1: To Defined A CustomAnnotationOne
 * @create 2019/1/8
 */
public @interface CustomAnnotationOne {
}
@interface CustomAnnotationInner{
}

class TestOne{
    @CustomAnnotationOne
    public void TestOne(){}

    @CustomAnnotationInner
    public void TestInner(){}
}
