package com.dk.enumerate;

/**
 * @author DingKai
 * @Classname Color
 * @Description To Learn Enumerate 1:Constant
 *              The Enumerate Class Can Storage Constant ==> public static final
 *              For Example :Create Class Then Definition "public static final"
 *              Variable
 *              Now U Can Use Enumerate Class To Definition Constant
 * @create 2018/12/24
 */
//Enumerate Class
public enum Color {
    GREEN,BLUE,RED,YELLOW
}

/*To Test Enumerate Class*/
class Test{
    public static void main(String[] args) {
        //1.Enumerate Constant
        System.out.println("red ==> " + Color.RED + "\n" + "blue ==> " + Color.BLUE);
        System.out.println("green ==> " + Color.GREEN + "\n" + "yellow ==> " + Color.YELLOW);
    }
}
