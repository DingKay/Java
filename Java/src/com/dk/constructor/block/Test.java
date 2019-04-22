package com.dk.constructor.block;

import com.dk.utils.DK;

/**
 * @author DingKai
 * @Classname Test
 * @Description TODO
 * @create 2019/4/22
 */
public class Test {
    public static void main(String[] args) {
        new BlockTest();{
            DK.print("Constructor block");
        }
    }
}
