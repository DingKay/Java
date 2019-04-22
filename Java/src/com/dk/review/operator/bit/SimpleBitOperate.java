package com.dk.review.operator.bit;

import com.dk.utils.DK;

/**
 * @author DingKai
 * @Classname SimpleBitOperate
 * @Description TODO
 * @create 2019/4/22
 */
public class SimpleBitOperate {
    /**
     * simple int digital
     */
    private static int four = 4;
    private static int eight = 8;

    public static void main(String[] args) {
        // variable eight >> 2 then : decimal 8 equals binary 1000, 1000 right shift 2 bit > 10 (binary) equals
        // decimal 2
        DK.print((eight >> 2) + "");
        DK.print((four << 2) + "");
    }
}
