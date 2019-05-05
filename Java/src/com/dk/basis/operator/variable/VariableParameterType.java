package com.dk.basis.operator.variable;

/**
 * @author DingKai
 * @Classname VariableParameterType
 * @Description To learn Method's Variable Parameter
 * @create 2019/4/15
 */
public class VariableParameterType {

    public static void main(String[] args) {
        Integer dk = new VariableParameterType().getUserIds("dingkai");
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
