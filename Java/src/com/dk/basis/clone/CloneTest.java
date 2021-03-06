package com.dk.basis.clone;

import com.dk.util.Out;

/**
 * @author DingKai
 * @Classname CloneTest
 * TODO
 * @date 2019/4/17
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CommonClone common = new CommonClone(new CloneObj("String Test", 99));
        Object clone = common.clone();

        Out.print(common.toString());
        Out.print(clone.toString());

        Out.printEqualSign(30);
        // modify common
        common.setName("new clone name");
        common.setAge(18);
        // modify common's attribute CloneObj
        CloneObj cloneObj = common.getCloneObj();
        cloneObj.setStringTest("new String Test");
        cloneObj.setAnIntTest(200);
        // Java shallow clone : variable clone will equals variable common object
        Out.print(common.toString());
        Out.print(clone.toString());
    }
}
