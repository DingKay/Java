package com.dk.utils;

/**
 * @author DingKai
 * @Classname DK
 * @Description Faster use and faster work ,In this repository ,so many class or other display console output.
 *              so create this utils class for distinguish different situation of console output
 * @create 2019/2/11
 */
public class DK {
    /*Quickly to print "=" for create a new line*/
    public static void printEqualSign(){
        System.out.println("==============================");
    }

    /*Customize:Quickly to print anything , distinguish different situation of print*/
    public static void print(String detal){
        System.out.println("\n" + detal + "\n");
    }
}
