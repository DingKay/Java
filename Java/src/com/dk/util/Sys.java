package com.dk.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/6/6
 */
public class Sys {

    public String getLocalIp() {
        String string = "";
        try {
            string = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return string;
    }
}
