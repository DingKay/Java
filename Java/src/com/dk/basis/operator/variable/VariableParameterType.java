package com.dk.basis.operator.variable;

/**
 * To learn Method's Variable Parameter
 * @author DingKai
 * @version 1.0
 */
public class VariableParameterType {

    public static void main(String[] args) {
        Integer dk = new VariableParameterType().getUserIds("DingKai");
        System.out.println(dk);
    }

    /**
     * Variable Parameter
     * void getSomethings(String... somethings)
     * U can
     */
     private Integer getUserIds(String type, int... ids){
        System.out.println("VariableParameterType.getUserIds");
        System.out.println("Type = " + type);
        // this variable ids toString method is Object's toString, so print result is variable address
        System.out.println("ids = " + ids);
        return 1;
    }
}
