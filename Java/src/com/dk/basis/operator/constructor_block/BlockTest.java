package com.dk.basis.operator.constructor_block;

import com.dk.util.Out;

/**
 * @author DingKai
 * @Classname BlockTest
 * @Description TODO
 * @create 2019/4/22
 */
public class BlockTest {
    static {
        Out.print("BlockTest's static block");
    }

    public BlockTest() {
        Out.print("BlockTest's Constructor");
    }
}
