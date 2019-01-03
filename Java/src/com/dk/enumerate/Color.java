package com.dk.enumerate;

/**
 * @author DingKai
 * @Classname Color
 * @Description To Learn Enumerate
 * @create 2018/12/24
 */
public enum Color {
    GREEN,BLUE,RED,YELLOW
}

class Test1{
    public static void main(String[] args) {
        //1.Enumerate Constant
        System.out.println("red ==> " + Color.RED + "\n" + "blue ==> " + Color.BLUE);
        System.out.println("green ==> " + Color.GREEN + "\n" + "yellow ==> " + Color.YELLOW);
    }
}
