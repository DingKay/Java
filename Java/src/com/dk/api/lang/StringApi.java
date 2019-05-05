package com.dk.api.lang;

/**
 * @author DingKai
 * @Classname StringApi
 * @Description To learn String class at lang package.
 * @create 2019/1/15
 */
public class StringApi {
    /**
     * testString 'abcdefg'
     */
    private static String text = "abcdefg";
    
    /**
     * testString '123456'
     */
    private static String digital = "123456";

    /**
     * example 'null' object
     */
    private static String none = null;

    /**
     * contain ' ' string
     */
    private static String space = " q we r ";
    
    public static void main(String[] args) {
        // 1.equals: method for comparing two variables for equality, this is better then '==' operate
        boolean equals = text.equals(digital);
        /*
        tips: if fist variable is null ,will throw NullPointerException, so we need set a known and definite
        variable at fist to comparing. see follow example:
        */
        try {
            equals = none.equals(text);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        // 2.trim:

    }
}
