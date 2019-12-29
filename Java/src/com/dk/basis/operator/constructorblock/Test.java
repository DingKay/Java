package com.dk.basis.operator.constructorblock;

import com.dk.util.Out;

/**
 * @author DingKai
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new BlockTest();{
            Out.print("Constructor block");
        }
    }
}
