package com.dk.geektime.everyday;

/**
 * @author DingKai
 * @version 1.0
 */
public class Goods {
    private String goodName = "good-name";
    private String test = "test-abc";

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodName='" + goodName + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
