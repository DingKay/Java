package com.dk.basis.enumerate;

import com.dk.util.Out;

/**
 *  To Learn Enumerate 1:Constant
 *              The Enumerate Class Can Storage Constant ==> public static final
 *              For Example :Create Class Then Definition "public static final"
 *              Variable
 *              Now U Can Use Enumerate Class To Definition Constant
 * @author DingKai
 * @version 1.0
 */
public enum Color {
    /**
     * this is Comment
     */
    GREEN,BLUE,RED,YELLOW
}

/**
 * To Test Enumerate Class
 */
class Test{
    public static void main(String[] args) {
        //1.Enumerate Constant
        System.out.println("red ==> " + Color.RED + "\n" + "blue ==> " + Color.BLUE);
        System.out.println("green ==> " + Color.GREEN + "\n" + "yellow ==> " + Color.YELLOW);

        Out.printEqualSign(30);

        Color color = Color.BLUE;
        Out.print(color.toString());
        color = Color.RED;
        Out.print(color.toString());
    }
}
