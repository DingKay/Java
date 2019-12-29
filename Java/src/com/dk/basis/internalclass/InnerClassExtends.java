package com.dk.basis.internalclass;

/**
 * @author DingKai
 * @version 1.0
 */
public class InnerClassExtends extends InternalClassTest.Base{
    public InnerClassExtends(InternalClassTest ict){
        ict.super();
        System.out.println("InnerClassExtends.InnerClassExtends");
    }
}
