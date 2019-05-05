package com.dk.basis.internal_class;

/**
 * @author dingkai
 * @create 2018-11-19 16:29
 */
public class InnerClassExtends extends InternalClassTest.Base{
    public InnerClassExtends(InternalClassTest ict){
        ict.super();
        System.out.println("InnerClassExtends.InnerClassExtends");
    }
}
