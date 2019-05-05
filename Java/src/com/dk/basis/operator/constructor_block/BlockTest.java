package com.dk.basis.operator.constructor_block;

import com.dk.utils.DK;

/**
 * @author DingKai
 * @Classname BlockTest
 * @Description TODO
 * @create 2019/4/22
 */
public class BlockTest {
    static {
        DK.print("BlockTest's static block");
    }

    public BlockTest() {
        DK.print("BlockTest's Constructor");
    }
}
