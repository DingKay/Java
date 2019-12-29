package com.dk.basis.operator.bitoperation;

import com.dk.util.Out;

/**
 * @author DingKai
 * @version 1.0
 */
public class SimpleBitOperate {
    /**
     * simple int digital
     */
    private static int four = 4;
    private static int eight = 8;

    public static void main(String[] args) {
        // variable eight >> 2 then : decimal 8 equals binary 1000, 1000 right shift 2 bit operation > 10 (binary)
        // decimal 2
        Out.print((eight >> 2) + "");
        Out.print((four << 2) + "");
    }
}
