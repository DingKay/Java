package com.dk.util;

/**
 * @author DingKai
 * @Classname Out
 * @Description Faster use and faster work ,In this repository ,so many class or other display console output.
 *              so create this util class for distinguish different situation of console output
 * @create 2019/2/11
 */
public class Out {
    public enum PrintColor{
        /**
         * cyan-blue
         */
        BLACK("\033[30;m", "\033[m"),
        RED("\033[31;m", "\033[m"),
        GREEN("\033[32;m", "\033[m"),
        YELLOW("\033[33;m", "\033[m"),
        BLUE("\033[34;m", "\033[m"),
        MAGENTA("\033[35;m", "\033[m"),
        CYAN("\033[36;m", "\033[m"),
        WHITE("\033[37;m", "\033[m");

        private String prefix;
        private String suffix;

        public String getPrefix() {
            return prefix;
        }

        public String getSuffix() {
            return suffix;
        }

        PrintColor(String prefix, String suffix) {
            this.prefix = prefix;
            this.suffix = suffix;
        }
    }

    /**
     * Quickly to print sign for create a new line
     * <p>default sign value "#"</p>
     */
    public static void printEqualSign(int length, String... s){
        String string, sign;
        sign = "";
        for (String s1 : s) {
            sign += s1;
        }
        StringBuilder out = new StringBuilder();
        if ("".equals(sign) || null == sign){
            string = "#";
        } else {
            if (sign.length() > 1){
                string = String.valueOf(sign.toCharArray()[0]);
            } else {
                string = sign;
            }
        }
        for (int i = 0; i < length; i++) {
            out.append(string);
        }

        System.out.println(out);
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
        String printOut;
        switch (color) {
            case BLACK:
                printOut = withBold(PrintColor.BLACK.getPrefix(), bold) + string + PrintColor.BLACK.getSuffix();
                break;
            case RED:
                printOut = withBold(PrintColor.RED.getPrefix(), bold) + string + PrintColor.RED.getSuffix();
                break;
            case GREEN:
                printOut = withBold(PrintColor.GREEN.getPrefix(), bold) + string + PrintColor.GREEN.getSuffix();
                break;
            case YELLOW:
                printOut = withBold(PrintColor.YELLOW.getPrefix(), bold) + string + PrintColor.YELLOW.getSuffix();
                break;
            case BLUE:
                printOut = withBold(PrintColor.BLUE.getPrefix(), bold) + string + PrintColor.BLUE.getSuffix();
                break;
            case MAGENTA:
                printOut = withBold(PrintColor.MAGENTA.getPrefix(), bold) + string + PrintColor.MAGENTA.getSuffix();
                break;
            case WHITE:
                printOut = withBold(PrintColor.WHITE.getPrefix(), bold) + string + PrintColor.WHITE.getSuffix();
                break;
            case CYAN:
                printOut = withBold(PrintColor.CYAN.getPrefix(), bold) + string + PrintColor.CYAN.getSuffix();
                break;
                default:
                    printOut = string;
                    break;
        }
        System.out.println(printOut);
    }

    /**
     * determine if you need to bold text on output
     * @author DingKai
     * @date 2019/5/24
     * @param string
     * @param bold
     * @return java.lang.String
     */
    private static String withBold(String string, boolean bold) {
        String result = string;
        if (bold) {
            String[] split = string.split(";");
            result = split[0] + ";1" + split[1];
        }
        return result;
    }
}
