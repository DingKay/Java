package com.dk.basis.operator.constructor_block;

import com.dk.util.DK;

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
