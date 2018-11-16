package com.dk.internal;

/**
 * @author dingkai
 * @create 2018-11-16 15:17
 */
public class TestToInternal {
    public static void main(String[] args) {
        //成员内部类-获取单例Student对象
        new InternalClassTest().getStudentInternalClassTest();

        //成员内部类-创建Person对象
        new InternalClassTest().new Person();

        //成员内部类的类型为 类名.成员类名
        InternalClassTest.Person person = new InternalClassTest().new Person();

        //静态内部类

    }
}
