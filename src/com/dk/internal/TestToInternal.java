package com.dk.internal;

/**
 * @author dingkai
 * @create 2018-11-16 15:17
 */
public class TestToInternal {
    public static void main(String[] args) {
        //成员内部类-获取单例Student对象 方法一
        new InternalClassTest().getStudentInternalClassTest();

        //成员内部类-创建Person对象 方法二 成员内部类的类型为 类名.成员类名
        InternalClassTest.Person person = new InternalClassTest().new Person();

        //静态内部类
        InternalClassTest.staticClassTest ictsc = new InternalClassTest.staticClassTest();
        //调用静态内部类的print方法
        ictsc.print();

        //局部内部类
        new InternalClassTest().methodInternalClass().print();

        //局部内部类 但无实际意义
        new InternalClassTest().methodInternalClass1();
    }
}
