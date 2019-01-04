package com.dk.enumerate;

/**
 * @author DingKai
 * @Classname SwitchEnum
 * @Description To Learn Enumerate :switch
 *              Since JDK 1.6 :switch Statement Can Use Enumerate
 *              More Fast and Easy
 * @create 2019/1/4
 */
enum toSwitchEnum {
    ONE,TWO,THREE
}

public class SwitchEnum {
    public static void main(String[] args) {
        toSwitchEnum color = toSwitchEnum.ONE;
        System.out.println("origin ==> " + color);
        color = change(color);
        System.out.println("change ==> " + color);

        System.out.println("\n==========\n");

        /*Enumerate Class Attribute Default Use >>public static final<<
         *Even If It's Reference Type
         *Normal Method :
         *switch (color){
         * case ONE:
         *     color = toSwitchEnum.TWO;
         *     break;
         *     ...
         *So Look Below
         */
        toSwitchEnum referenceTest = color;
        System.out.println("test1 = " + referenceTest);
        referenceTest = toSwitchEnum.THREE;
        System.out.println("test1 = " + referenceTest + "\t" + "color = " + color);
    }

    private static toSwitchEnum change(toSwitchEnum color) {
        switch (color){
            case ONE:
                return toSwitchEnum.TWO;
            case TWO:
                return toSwitchEnum.THREE;
            case THREE:
                return toSwitchEnum.ONE;
            default:
                return null;
        }
    }
}
