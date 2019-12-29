package com.dk.basis.clone;

/**
 * @author DingKai
 * @version 1.0
 */
public class CloneObj {
    public String stringTest;

    public int anIntTest;

    public CloneObj(String stringTest, int anIntTest) {
        this.stringTest = stringTest;
        this.anIntTest = anIntTest;
    }

    public String getStringTest() {
        return stringTest;
    }

    public void setStringTest(String stringTest) {
        this.stringTest = stringTest;
    }

    public int getAnIntTest() {
        return anIntTest;
    }

    public void setAnIntTest(int anIntTest) {
        this.anIntTest = anIntTest;
    }
}
