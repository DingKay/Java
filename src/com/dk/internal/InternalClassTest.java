package com.dk.internal;

/**
 * @author dingkai
 * @create 2018-11-15 10:49
 */
public class InternalClassTest {

    private InternalClassTest.Student s;
    //single
    InternalClassTest.Student getStudentInternalClassTest(){
        if(null == s){
            s = new InternalClassTest.Student();
            return s;
        }
        return s;
    }

    //成员内部类
    public class Person{
        public Person(){
            System.out.println("i'm Person Constructor");
        }
    }
    //成员内部类-继承Person
    private class Student extends InternalClassTest.Person{
        private Student(){
            System.out.println("i'm Student Constructor and Private");
        }
    }

    //静态内部类
    public static class staticClassTest{
        public void print(){
            System.out.println("i'm staticClassTest");
        }
    }

    public InternalClassTest.Person methodInternalClass(){
        class Teacher extends InternalClassTest.Person{}
        return new Teacher();
    }

    public void methodInternalClass1(){
        class Test{
            public void print(){
                System.out.println("I'm MethodInternalClass1.Test print");
            }
        }
        new Test().print();
        System.out.println("==================");
    }
}
