package com.dk.basis.reflect.getinnerclazz;

/**
 * Test get method or field use reflect at runtime.
 * @author DingKai
 * @version 1.0
 */
public class InnerContainer {
    public class InnerA{
        public InnerA(){}
        private String field = InnerA.class.getSimpleName();
    }

    private static class InnerB{
        public InnerB(){}
        private String field = InnerB.class.getSimpleName();
    }

    private Runnable field = new Runnable() {
        @Override
        public void run() {
            System.out.println("Method run of runnable field");
        }
    };
}
