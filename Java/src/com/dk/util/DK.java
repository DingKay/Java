package com.dk.util;

/**
 * @author DingKai
 * @Classname DK
 * @Description Faster use and faster work ,In this repository ,so many class or other display console output.
 *              so create this util class for distinguish different situation of console output
 * @create 2019/2/11
 */
public class DK {
    public enum PrintColor{
        CYAN;
    }
    /**
     * cyan-blue
     */
    private static final String CYAN_PREFIX = "\033[36;m";

    private static final String CYAN_SUFFIX = "\033[m";

    /**
     * Quickly to print "=" for create a new line
     */
    public static void printEqualSign(){
        System.out.println("==============================");
    }

    /**
     * Customize:Quickly to print anything , distinguish different situation of print
     */
    public static void print(String detail){
        System.out.println("\n" + detail + "\n");
    }

    public static void print(boolean b) {
        System.out.println("\n" + b + "\n");
    }

    /**
     * print with color
     * @date 2019/5/20
     * @param string string to be output
     * @param color color when output
     * @param bold whether to bold the string, true is bold ;false no bold
     */
    public static void printWithColor(String string, PrintColor color, boolean bold) {
        String printOut = "";
        switch (color) {
            case CYAN:
                printOut += withBold(CYAN_PREFIX, bold) + string + CYAN_SUFFIX;
                break;

                default:
                    break;
        }
        System.out.println(printOut);
    }

    private static String withBold(String string, boolean bold) {
        String result = string;
        if (bold) {
            String[] split = string.split(";");
            result = split[0] + ";1" + split[1];
        }
        return result;
    }
}
