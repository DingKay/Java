package com.dk.api.lang;

import com.dk.util.Out;

/**
 * To learn String class at lang package.
 * @author DingKai
 * @version 1.0
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

    /**
     * int's limit length
     */
    private static int maxLength = 1234567890;

    /**
     * Static int value
     */
    private static final int TWO = 2;

    /**
     * for split
     */
    private static String forSplit = "a;b;c;d =|= ;e,f,g,h";
    
    public static void main(String[] args) {
        Out.title("String.equals");
        // 1.equals: method for comparing two variables for equality, this is better then '==' operate
        boolean equals = text.equals(digitalString);
        /*
        tips: if fist variable is null ,will throw NullPointerException, so we need set a known and definite
        variable at fist to comparing. see follow example:
        */
        try {
            equals = none.equals(text);
        } catch (NullPointerException e) {
            Out.printWithColor(e.toString(), Out.PrintColor.RED, true);
        }
        // different type of variable, class String's equals method can't use on different Object
        boolean equalsDigital = digitalString.equals(digital);
        System.out.println("String \"123456\" comparing int 123456 :" + equalsDigital);

        Out.printEqualSign(40);
        Out.title("String.trim");
        // 2.trim: Remove the 'space' character on both sides of the string and the character whose ASCII code is less
        // than 'space' (char='' ASCII decimal bit 32), at this example string include special character '\n'
        String trim = space.trim();
        Out.printWithColor("original 'space' string:" + space + ";\nnow 'space' string:" + trim + ";",
                Out.PrintColor.BLUE, false);

        Out.printEqualSign(40);
        Out.title("String.compareTo");
        // 3.compareTo: the a compare to b, compare with ascii code
        // return value is the ascii code operation result, can be positive and negative or zero
        int negative = a.compareTo(b);
        int positive = g.compareTo(a);
        int zero = a.compareTo(a);
        System.out.println("a compare to b = " + negative + ", g compare to a = " + positive + ", a compare to a = " + zero);

        Out.print("abc compare adb = " + abc.compareTo(abd));

        Out.printEqualSign(40);
        Out.title("String.hashCode");
        // 4.hashCode: every char ascii code to multiply *31
        // todo *why multiply 31 ?
        /*
        int the max length be eleven bit of sign number digital and 1 * 2^31 equals 1 * 2^32 - 1
        h = 31 * h + val[i]
        */
        int hashCode = text.hashCode();
        System.out.println("test hashCode = " + hashCode + " and length = " + String.valueOf(hashCode).length() +
                ", digital 0 hashCode = " + "0".hashCode() + " and length = " + String.valueOf("0".hashCode()).length());
        // compressed hash value, The space of the hash value is usually much smaller than the input space.
        int maxLengthHashCode = String.valueOf(maxLength).hashCode();
        System.out.println("maxLengthHashCode = " + maxLengthHashCode + " maxLengthHashCode length = " +
                String.valueOf(maxLengthHashCode).length());
        // hash collision: String "gdejicbegh" hascCode equals "hgebcijedg" and Both of them are special flip strings
        Out.printWithColor("hash collision", Out.PrintColor.CYAN, true);
        System.out.println("gdejicbegh hashCode:" + "gdejicbegh".hashCode() + " hgebcijedg hashCode:" +
                "hgebcijedg".hashCode());
        // override hash code method
        int code = getHashCode("0123456789");
        Out.printWithColor("0123456789 hash code==>" + code, Out.PrintColor.CYAN, true);
        // why use this arithmetic
        hashCodeArithmetic();

        Out.printEqualSign(40);
        Out.title("String.split");
        // 5.split:split a string into multiple strings
        String[] split = forSplit.split(";");

        split = forSplit.split(";", 3);
        Out.print("before split:" + forSplit + "\nafter split: split[] length:" + split.length + "\tsplit[0]=" + split[0]
                + "\tsplit[1]=" + split[1] + "\tsplit[2]=" + split[2] + "\tsplit second parameter is after split[] " +
                "length");


    }

    /**
     * reversal the String use recursive call
     * @author DingKai
     * @date 2019/5/20
     * @param str
     * @return java.lang.String
     */
    public static String reverseString(String str) {
        if ((null == str) || str.length() < TWO) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /**
     * use algorithm get hash code
     * @author DingKai
     * @date 2019/5/24
     * @param string
     * @return int
     */
    public static int getHashCode(String string) {
        int hash = 0;
        int h = hash;
        char[] value = string.toCharArray();
        if (value.length > 0) {
            char[] val = value;
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return hash;
    }

    /**
     * Java hashCode arithmetic
     * @author DingKai
     * @date 2019/5/29
     */
    public static void hashCodeArithmetic() {
        int hashCode = 0;
        int [] s = {0, 1, 2, 3, 4};

        hashCode = (s[0] * (31 * 31 * 31 * 31)) + (s[1] * (31 * 31 * 31)) + (s[2] * 31 * 31) + (s[3] * 31) + s[4];
        Out.print("hashCodeArithmetic original first:" + hashCode);

        int h = 0;
        for (int i = 0; i < s.length; i++) {
            h = 31 * h + s[i];
        }
        /*
        jdk:
        s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

        original:
        s[0]
        s[0] * 31 + s[1]
        (s[0] * 31 + s[1]) * 31 + s[2]
        ((s[0] * 31 + s[1]) * 31 + s[2]) * 31 + s[3]

        Change:
        ((s[0] * 31^2 + s[1] * 31) + s[2]) * 31 + s[3]
        s[0] * 31^3 + s[1] * 31^2 + s[2] * 31 + s[3]
        */
        Out.print("hashCodeArithmetic change second:" + h);
    }

}
