package com.dk.basis.operator.cycle;

/**
 * @author DingKai
 * @Classname ToUseLabel
 * @Description TODO
 * @create 2019/1/23
 */
public class ToUseLabel {
    public static void main(String[] args) {
        System.out.println("Label");
        inner:
        for (int j = 0; j < 3; j++) {
            System.out.println("j = " + j);
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
                if (i == 0) {
                    System.out.println("Continue");
//                    continue inner;
                    break ;
                }
            }
        }
    }
}
