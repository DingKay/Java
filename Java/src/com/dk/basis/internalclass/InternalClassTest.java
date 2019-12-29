package com.dk.basis.internalclass;

/**
 * @author DingKai
 * @version 1.0
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
        public void print(){}
    }
    //成员内部类-继承Person
    private class Student extends InternalClassTest.Person{
        private Student(){
            System.out.println("i'm Student Constructor and Private");
        }
    }

    //静态内部类
    public static class StaticClassTest{
        public void print(){
            System.out.println("i'm staticClassTest print");
        }
    }

    //局部内部类
    public InternalClassTest.Person MethodInternalClass(){
        class Teacher extends InternalClassTest.Person{
            @Override
            public void print(){
                System.out.println("i'm InternalClassTest.methodInternalClass print");
            }
        }
        return new Teacher();
    }

    //局部内部类
    public void MethodInternalClass1(){
        class Test{
            public void print(){
                System.out.println("I'm MethodInternalClass1.Test print");
            }
        }
        new Test().print();
    }
    //局部内部类的多重嵌套
    public class NestingOne{
        void print(){
            System.out.println("NestingOne.print");
        }
        public class NestingTwo{
            void print(){
                System.out.println("NestingTwo.print");
            }
            public class NestingThree{
                void print(){
                    System.out.println("NestingThree.print");
                }
            }
        }
    }

    //内部类中的继承
    class Base{
        Base(){
            System.out.println("InternalClassTest ==> Base.Base");
        }
    }

    class Son extends InternalClassTest.Base{
        Son(){
            System.out.println("InternalClassTest ==> Son.Son");
        }
    }

    class ExtendsBase extends InnerClassBase {
        ExtendsBase(){
            System.out.println("InternalClassTest ==> ExtendsBase.ExtendsBase");
        }
    }
}
