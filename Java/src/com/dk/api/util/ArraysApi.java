package com.dk.api.util;

import java.util.*;

/**
 * @author DingKai
 * @Classname ArraysApi
 * @Description TODO
 * @create 2019/1/15
 */
public class ArraysApi {
    private static String abc = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
    private static String repeat = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    private static List<String> strings;
    public static void main(String[] args) {
        //asList
        StringBuilder stringBuilder = new StringBuilder(abc).append(",").append(abc);
        strings = Arrays.asList(stringBuilder.toString().split(","));
        strings = new ArrayList(new TreeSet(strings));
        System.out.println(strings);
    }
}
