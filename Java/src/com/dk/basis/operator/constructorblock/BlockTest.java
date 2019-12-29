package com.dk.basis.operator.constructorblock;

import com.dk.util.Out;

/**
 * @author DingKai
 * @version 1.0
 */
public class BlockTest {
    static {
        Out.print("BlockTest's static block");
    }

    public BlockTest() {
        Out.print("BlockTest's Constructor");
    }
}
