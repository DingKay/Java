package com.dk.clone;

import com.dk.utils.DK;

/**
 * @author DingKai
 * @Classname CloneTest
 * @Description TODO
 * @create 2019/4/17
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CommonClone common = new CommonClone(new CloneObj("String Test", 99));
        Object clone = common.clone();

        DK.print(common.toString());
        DK.print(clone.toString());

        DK.printEqualSign();
        // modify common
        common.setName("newclonename");
        common.setAge(18);
        // modify common's attribute CloneObj
        CloneObj cloneObj = common.getCloneObj();
        cloneObj.setStringTest("new String Test");
        cloneObj.setAnIntTest(200);
        // Java shallow clone : variable clone will equals variable common object
        DK.print(common.toString());
        DK.print(clone.toString());
    }
}
