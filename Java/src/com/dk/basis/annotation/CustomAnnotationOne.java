package com.dk.basis.annotation;

/**
 * To Learn Annotation 1: To Defined A CustomAnnotationOne
 * @author DingKai
 * @version 1.0
 */
public @interface CustomAnnotationOne {}
/**
 * 自定义注解
 * @author DingKai
 * @date 2019/12/23
 */
@interface CustomAnnotationInner {}

class TestOne{
    @CustomAnnotationOne
    public void TestOne(){}

    @CustomAnnotationInner
    public void TestInner(){}
}
