package com.dk.learn.base64;

import com.dk.util.Out;
import sun.misc.BASE64Decoder;


/**
 * decode base64
 * @author DingKai
 * @version 1.0
 */
public class Base64Test {
    public static void main(String[] args) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            Out.print(new String(base64Decoder.decodeBuffer("tqG/rdXF0OM="), "GB2312"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
