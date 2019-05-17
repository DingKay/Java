package com.dk.api.lang;

/**
 * @author DingKai
 * @Classname StringApi
 * @Description To learn String class at lang package.
 * @create 2019/1/15
 */
public class StringApi {
    /**
     * equals
     * testString 'abcdefg'
     */
    private static String text = "abcdefg";
    
    /**
     * testString '123456'
     */
    private static String digitalString = "123456";

    /**
     * test int 123456
     */
    private static int digital = 123456;

    /**
     * example 'null' object
     */
    private static String none = null;

    /**
     * trim
     * contain ' ' string
     */
    private static String space = " q we r \n dk \n";

    /**
     * compareTo
     * simple single string a,b,g
     * ASCII a = 97
     *       b = 98
     *       g = 103
     */
    private static String a = "a";

    private static String b = "b";

    private static String g = "g";

    /**
     * complex combination string abc
     */
    private static String abc = "abc";

    /**
     * complex combination string abd
     */
    private static String abd = "abd";
    
    public static void main(String[] args) {
        // 1.equals: method for comparing two variables for equality, this is better then '==' operate
        boolean equals = text.equals(digitalString);
        /*
        tips: if fist variable is null ,will throw NullPointerException, so we need set a known and definite
        variable at fist to comparing. see follow example:
        */
        try {
            equals = none.equals(text);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        // different type of variable
        boolean equalsDigital = digitalString.equals(digital);
        System.out.println("String \"123456\" comparing int 123456 :" + equalsDigital);

        // 2.trim: Remove the 'space' character on both sides of the string and the character whose ASCII code is less
        // than 'space' (char='' ASCII decimal bit 32), at this example string include special character '\n'
        String trim = space.trim();
        System.out.println("original 'space' string:" + space + ";\nnow 'space' string:" + trim + ";");

        // 3.compareTo: the a compare to b, compare with ascii code
        // return value is the ascii code operation result, can be positive and negative or zero
        int negative = a.compareTo(b);
        int positive = g.compareTo(a);
        int zero = a.compareTo(a);
        System.out.println("a compare to b = " + negative + ", g compare to a = " + positive + ", a compare to a = " + zero);

        // 4.hashCode:
        int hashCode = text.hashCode();
        System.out.println(hashCode);
        System.out.println(new StringApi().reverseString(text));
    }

    public String reverseString(String str) {
        if ((null == str) || str.length() < 2) {
            return str;
        }
        return reverseString(str.substring(1)) +str.charAt(0);
    }

}
