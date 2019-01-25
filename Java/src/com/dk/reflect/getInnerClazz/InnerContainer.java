package com.dk.reflect.getInnerClazz;

/**
 * @author DingKai
 * @Classname InnerContainer
 * @Description TODO
 * @create 2019/1/23
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

    private Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Method run of runnable r");
        }
    };
}
