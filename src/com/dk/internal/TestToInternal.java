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

        System.out.println("== 静态内部类 ==");
        //静态内部类
        InternalClassTest.StaticClassTest ictsc = new InternalClassTest.StaticClassTest();
        //调用静态内部类的print方法
        ictsc.print();

        System.out.println("== 调用局部内部类的方法 ==");
        //局部内部类return 一个对象
        new InternalClassTest().MethodInternalClass().print();

        //局部内部类 在方法内完成调用
        new InternalClassTest().MethodInternalClass1();

        System.out.println("== 成员内部类的多重嵌套 ==");

        //成员内部类的多重嵌套 one
        new InternalClassTest().new NestingOne().print();

        //two
        new InternalClassTest().new NestingOne().new NestingTwo().print();

        //three
        new InternalClassTest().new NestingOne().new NestingTwo().new NestingThree().print();
    }
}
